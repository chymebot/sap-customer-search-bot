//	Generated using Unvired Modeller - Build R-4.000.0042
package com.chyme.customer.gen.be;

import java.util.ArrayList;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class CUSTOMER extends BusinessEntity {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "CUSTOMER";
	public CUSTOMER()
	{
		setName(NAME);
		setHeader(new CUSTOMER_HEADER());
	}

	public CUSTOMER_HEADER getCUSTOMER_HEADER()
	{
		return (CUSTOMER_HEADER)super.getHeader();
	}

	public static class CUSTOMER_HEADER extends Structure
	{
		private static final long serialVersionUID = 1L;
		public static final String NAME = "CUSTOMER_HEADER";

		public static final String FLD_CUSTOMER_NO = "CUSTOMER_NO";
		public static final String FLD_NAME = "NAME";
		public static final String FLD_ADDRESS = "ADDRESS";

		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
			FIELDS.add(FLD_CUSTOMER_NO);
			FIELDS.add(FLD_NAME);
			FIELDS.add(FLD_ADDRESS);
		}

		public CUSTOMER_HEADER()
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

		public String getNAME()
		{
			return getField(FLD_NAME);
		}

		public void setNAME(String value)
		{
			if(value != null)
				addField(FLD_NAME, value);
		}

		public String getADDRESS()
		{
			return getField(FLD_ADDRESS);
		}

		public void setADDRESS(String value)
		{
			if(value != null)
				addField(FLD_ADDRESS, value);
		}

	}
}