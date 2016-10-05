//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.customer.gen.be;

import java.util.ArrayList;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class BE_SearchCustomer extends BusinessEntity {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "BE_SearchCustomer";
	public BE_SearchCustomer()
	{
		setName(NAME);
		setHeader(new SearchCustomer_HEADER());
	}

	public SearchCustomer_HEADER getSearchCustomer_HEADER()
	{
		return (SearchCustomer_HEADER)super.getHeader();
	}

	public static class SearchCustomer_HEADER extends Structure
	{
		private static final long serialVersionUID = 1L;
		public static final String NAME = "SearchCustomer_HEADER";

		public static final String FLD_CUSTOMER_NO = "CUSTOMER_NO";

		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
			FIELDS.add(FLD_CUSTOMER_NO);
		}

		public SearchCustomer_HEADER()
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