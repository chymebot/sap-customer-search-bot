//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.customer.pa;

import com.chyme.customer.gen.pa.ABSTRACT_COMMAND_SEARCHCUSTOMER;
import com.unvired.chyme.api.Message;
import com.unvired.lib.utility.ProcessAgentUtility;

public class COMMAND_SEARCHCUSTOMER extends ABSTRACT_COMMAND_SEARCHCUSTOMER {

	public void execute() {
		
		try {			
			executeISA_CUSTOMER_SEARCH();
			
			String responseText = "No customers found for the criteria.";
			
			if (chymeAPI.getBusinessEntityOutput().size() > 0)				
				responseText = "Customer(s) matching your search criteria have been found.";			

			chymeAPI.setMessage(new Message(responseText));
		} catch (Exception e) {
			chymeAPI.setMessage(new Message(e.getMessage()));			
		}
	}

	protected void mapInputToISA_CUSTOMER_SEARCH_INPUT() {
		String customerNo = inputBE_SearchCustomer.getSearchCustomer_HEADER().getCUSTOMER_NO();
		isa_customer_search.setCUSTOMER_NUMBER(ProcessAgentUtility.alphaConversionSAPIn(customerNo, 10));
	}
}