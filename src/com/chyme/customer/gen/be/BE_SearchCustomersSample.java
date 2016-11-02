//	Generated using Unvired Modeller - Build R-4.000.0002
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

		public static final String FLD_CUSTOMER_NO = "CUSTOMER_NO";

		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
			FIELDS.add(FLD_CUSTOMER_NO);
		}

		public SearchCustomersSample_HEADER()
		{
			setName(NAME);
		}

		public String getCUSTOMER_NO()
		{
			return getField(FLD_CUSTOMER_NO);
		}

		public void setCUSTOMER_NO(String value)
		{
			if(value != null)
				addField(FLD_CUSTOMER_NO, value);
		}

	}
}