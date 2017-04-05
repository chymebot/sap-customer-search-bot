package com.chyme.customer.pa;

import com.chyme.customer.gen.be.CUSTOMER;
import com.chyme.customer.gen.pa.ABSTRACT_COMMAND_SEARCHCUSTOMERSSAMPLE;
import com.chyme.customer.gen.sapproxy.function.ISA_CUSTOMER_SEARCH;
import com.chyme.customer.gen.sapproxy.record.BAPIRETURN;
import com.chyme.customer.gen.sapproxy.record.CUSTOMER_FIND;
import com.chyme.customer.gen.sapproxy.record.CUSTOMER_FOUND;
import com.chyme.customer.utils.Utils;
import com.unvired.chyme.api.Message;
import com.unvired.lib.utility.InfoMessage;
import com.unvired.lib.utility.ProcessAgentUtility;
import com.unvired.ump.agent.IUMPResponse;

public class COMMAND_SEARCHCUSTOMERSSAMPLE extends ABSTRACT_COMMAND_SEARCHCUSTOMERSSAMPLE {

	private String customerNo;
	private String customerName;
	private int customerCount = 0;
	private String message = "";

	@Override
	public void execute() {
		try {
			mapInputToISA_CUSTOMER_SEARCH_INPUT();	
			chymeAPI.setTags("COMMAND_SEARCHCUSTOMERSSAMPLE", customerNo);	
		} catch (Throwable e) {
			Utils.handleError(chymeAPI, e, infoMessages);
		}
	}

	protected void mapInputToISA_CUSTOMER_SEARCH_INPUT() {

		isa_customer_search = new ISA_CUSTOMER_SEARCH();
		customerNo = inputBE_SearchCustomersSample.getSearchCustomersSample_HEADER().getcustomerNumber();
		customerName = inputBE_SearchCustomersSample.getSearchCustomersSample_HEADER().getcustomerName();

		if ((customerNo == null || customerNo.isEmpty()) && (customerName == null || customerName.isEmpty())) {
			message = "Please provide valid input to search customer.";
			chymeAPI.setMessage(new Message(message, null, Message.FLAG_NO_FOLLOWUP_COMMAND));
		} else {

			isa_customer_search.setCUSTOMER_NUMBER(ProcessAgentUtility.alphaConversionSAPIn(customerNo, 10));

			CUSTOMER_FIND customer_FIND = new CUSTOMER_FIND();
			customer_FIND.setMC_NAME(customerName);
			isa_customer_search.setADDRESS_DATA(customer_FIND);

			IUMPResponse response = callISA_CUSTOMER_SEARCH();
			mapOutputFromISA_CUSTOMER_SEARCH(response);
		}
	}

	protected void mapOutputFromCUSTOMERS_RESULTS() {
		
		Utils.checkforInfoMessages(infoMessages);

		// Initialize
		CUSTOMER beCUSTOMER = null;
		CUSTOMER.CUSTOMER_HEADER recCUSTOMER_HEADER = null;
		if (isa_customer_search.getCUSTOMERS_RESULTS() != null
				&& isa_customer_search.getCUSTOMERS_RESULTS().getRecordsList() != null) {
			long maxCount = 5;
			for (com.unvired.jco.Structure structure : isa_customer_search.getCUSTOMERS_RESULTS().getRecordsList()) {				
				CUSTOMER_FOUND customers_results_s = (CUSTOMER_FOUND) structure;
				beCUSTOMER = new CUSTOMER();
				recCUSTOMER_HEADER = beCUSTOMER.getCUSTOMER_HEADER();
				if ((customers_results_s.getKUNNR() == null || customers_results_s.getKUNNR().equals("")))
					continue;
				String customerNo = customers_results_s.getKUNNR();
				customerNo = customerNo.replaceFirst("0*", "");
				recCUSTOMER_HEADER.setCUSTOMER_NO(customerNo);			
				recCUSTOMER_HEADER.setNAME(customers_results_s.getNAME());
				String address = getAddress(customers_results_s);	
				recCUSTOMER_HEADER.setADDRESS(address);
				chymeAPI.addBE(beCUSTOMER);	
				chymeAPI.sendBE(true);
				customerCount++;
				if (--maxCount <= 0)
					break;
			}
		}		
		
		if (customerCount == 0) {
			message = "No customers found for the criteria. Please use CustomerNo: 1360 to try this bot.";
			chymeAPI.setMessage(new Message(message, null, Message.FLAG_NO_FOLLOWUP_COMMAND));
		} else {		
			message = "Customer(s) matching your search criteria have been found. Name: $NAME$\nAddress: $ADDRESS$";
			chymeAPI.setMessage(new Message(message, null, Message.FLAG_GROUP_BE));
		}				
	}

	private String getAddress(CUSTOMER_FOUND customers_results_s) {
		if (customers_results_s != null) {
			String address = "";
			if (customers_results_s.getHOUSE_NUM1() != null && !customers_results_s.getHOUSE_NUM1().isEmpty())
				address += customers_results_s.getHOUSE_NUM1();

			if (customers_results_s.getSTREET() != null && !customers_results_s.getSTREET().isEmpty()) {
				if (!address.isEmpty())
					address += ", " + customers_results_s.getSTREET();
				else
					address += customers_results_s.getSTREET();
			}

			if (customers_results_s.getCITY1() != null && !customers_results_s.getCITY1().isEmpty()) {
				if (!address.isEmpty())
					address += ", " + customers_results_s.getCITY1();
				else
					address += customers_results_s.getCITY1();
			}

			if (customers_results_s.getPOST_CODE1() != null && !customers_results_s.getPOST_CODE1().isEmpty()) {
				if (!address.isEmpty())
					address += ", " + customers_results_s.getPOST_CODE1();
				else
					address += customers_results_s.getPOST_CODE1();
			}

			return address;
		}
		return null;
	}

	protected void mapOutputFromISA_CUSTOMER_SEARCH(IUMPResponse response) {

		if (response.isSuccess()) {	
			BAPIRETURN bapiReturn = isa_customer_search.getRETURN();
			if (bapiReturn != null) {
				InfoMessage infoMessage;
				String type = bapiReturn.getTYPE();

				if ("A".equalsIgnoreCase(type) || "X".equalsIgnoreCase(type) || "E".equalsIgnoreCase(type)) {
					infoMessage = new InfoMessage(bapiReturn.getMESSAGE(), InfoMessage.InfoMessageType.APPLICATION,
							InfoMessage.InfoMessageCategory.FAILURE);
				} else {
					infoMessage = new InfoMessage(bapiReturn.getMESSAGE(), InfoMessage.InfoMessageType.APPLICATION,
							InfoMessage.InfoMessageCategory.SUCCESS);
				}

				infoMessages.add(infoMessage);
			}
			mapOutputFromCUSTOMERS_RESULTS();
		} else {
			infoMessages.addAll(response.getInfoMessages());
			Utils.checkforInfoMessages(infoMessages);			
		}
	}
}