//	Generated using Unvired Modeller - Build R-4.000.0042
package com.chyme.customer.gen.be;

import java.util.ArrayList;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class BE_SearchCustomersSample extends BusinessEntity {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "BE_SearchCustomersSample";
	public BE_SearchCustomersSample()
	{
		setName(NAME);
		setHeader(new SearchCustomersSample_HEADER());
	}

	public SearchCustomersSample_HEADER getSearchCustomersSample_HEADER()
	{
		return (SearchCustomersSample_HEADER)super.getHeader();
	}

	public static class SearchCustomersSample_HEADER extends Structure
	{
		private static final long serialVersionUID = 1L;
		public static final String NAME = "SearchCustomersSample_HEADER";

		public static final String FLD_customerNumber = "customerNumber";
		public static final String FLD_customerName = "customerName";

		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
			FIELDS.add(FLD_customerNumber);
			FIELDS.add(FLD_customerName);
		}

		public SearchCustomersSample_HEADER()
		{
			setName(NAME);
		}

		public String getcustomerNumber()
		{
			return getField(FLD_customerNumber);
		}

		public void setcustomerNumber(String value)
		{
			if(value != null)
				addField(FLD_customerNumber, value);
		}

		public String getcustomerName()
		{
			return getField(FLD_customerName);
		}

		public void setcustomerName(String value)
		{
			if(value != null)
				addField(FLD_customerName, value);
		}

	}
}