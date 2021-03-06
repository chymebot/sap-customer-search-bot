//	Generated using Unvired Modeller - Build R-4.000.0042
package com.chyme.customer.gen.pa;

import com.chyme.customer.gen.be.CUSTOMER;
import com.chyme.customer.gen.sapproxy.function.ISA_CUSTOMER_SEARCH;
import com.chyme.customer.gen.sapproxy.record.BAPIRETURN;
import com.chyme.customer.gen.sapproxy.record.CUSTOMER_FOUND;
import com.chyme.customer.gen.utils.BEUtility;
import com.unvired.lib.utility.InfoMessage;
import com.unvired.ump.agent.IBusinessProcess;
import com.unvired.ump.agent.IBusinessProcess.RequestType;
import com.unvired.ump.agent.ISAPRFCRequest;
import com.unvired.ump.agent.ISAPRFCResponse;
import com.unvired.ump.agent.IUMPResponse;

public abstract class ABSTRACT_COMMAND_SEARCHCUSTOMERSSAMPLE extends BotService {
	protected com.chyme.customer.gen.be.BE_SearchCustomersSample inputBE_SearchCustomersSample;
	protected ISA_CUSTOMER_SEARCH isa_customer_search;

	public void init(IBusinessProcess process) {
		super.init(process);

		inputBE_SearchCustomersSample = BEUtility.getBE_SearchCustomersSample(process.getBusinessEntityInput()).get(0);

	}

	protected void executeISA_CUSTOMER_SEARCH() {
		//	Map input to interface 
		mapInputToISA_CUSTOMER_SEARCH();

		//	Execute call to interface 
		IUMPResponse response = callISA_CUSTOMER_SEARCH();

		//	Extract Result
		mapOutputFromISA_CUSTOMER_SEARCH(response);

	}

	protected void mapInputToISA_CUSTOMER_SEARCH() {
		isa_customer_search = new ISA_CUSTOMER_SEARCH();
		//	BE_SearchCustomersSample
		mapInputToISA_CUSTOMER_SEARCH_INPUT();

	}

	protected void mapInputToISA_CUSTOMER_SEARCH_INPUT() {
		//	Process Input
		if (inputBE_SearchCustomersSample == null) {
			return;
		}

		isa_customer_search.setCUSTOMER_NUMBER(
				inputBE_SearchCustomersSample.getSearchCustomersSample_HEADER().getcustomerNumber());

	}

	protected IUMPResponse callISA_CUSTOMER_SEARCH() {
		ISAPRFCRequest rfcRequest = (ISAPRFCRequest) process.createRequest(RequestType.RFC);
		rfcRequest.setFunction(isa_customer_search);
		ISAPRFCResponse rfcResponse = (ISAPRFCResponse) process.getService().submitRequest(rfcRequest,
				Constant.ISA_CUSTOMER_SEARCH);
		return rfcResponse;
	}

	protected void mapOutputFromISA_CUSTOMER_SEARCH(IUMPResponse response) {
		if (response.isSuccess()) {
			//CUSTOMER
			mapOutputFromCUSTOMERS_RESULTS();

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
		}
		infoMessages.addAll(response.getInfoMessages());

	}

	protected void mapOutputFromCUSTOMERS_RESULTS() {
		//	Initialize
		CUSTOMER beCUSTOMER = null;
		CUSTOMER.CUSTOMER_HEADER recCUSTOMER_HEADER = null;
		if (isa_customer_search.getCUSTOMERS_RESULTS() != null
				&& isa_customer_search.getCUSTOMERS_RESULTS().getRecordsList() != null) {
			for (com.unvired.jco.Structure structure : isa_customer_search.getCUSTOMERS_RESULTS().getRecordsList()) {
				CUSTOMER_FOUND customers_results_s = (CUSTOMER_FOUND) structure;
				beCUSTOMER = new CUSTOMER();
				recCUSTOMER_HEADER = beCUSTOMER.getCUSTOMER_HEADER();

				if ((customers_results_s.getKUNNR() == null || customers_results_s.getKUNNR().equals("")))
					continue;

				recCUSTOMER_HEADER.setNAME(customers_results_s.getNAME());
				recCUSTOMER_HEADER.setCUSTOMER_NO(customers_results_s.getKUNNR());
				chymeAPI.addBE(beCUSTOMER);
			}
		}
	}

}
