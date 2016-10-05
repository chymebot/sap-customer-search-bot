//	Generated using Unvired Modeller - Build R-4.000.0002
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
		public static final String FLD_HOUSE_NO = "HOUSE_NO";
		public static final String FLD_STREET = "STREET";
		public static final String FLD_CITY = "CITY";
		public static final String FLD_POSTAL_CODE = "POSTAL_CODE";
		public static final String FLD_COUNTRY = "COUNTRY";

		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
			FIELDS.add(FLD_CUSTOMER_NO);
			FIELDS.add(FLD_NAME);
			FIELDS.add(FLD_HOUSE_NO);
			FIELDS.add(FLD_STREET);
			FIELDS.add(FLD_CITY);
			FIELDS.add(FLD_POSTAL_CODE);
			FIELDS.add(FLD_COUNTRY);
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

		public String getHOUSE_NO()
		{
			return getField(FLD_HOUSE_NO);
		}

		public void setHOUSE_NO(String value)
		{
			if(value != null)
				addField(FLD_HOUSE_NO, value);
		}

		public String getSTREET()
		{
			return getField(FLD_STREET);
		}

		public void setSTREET(String value)
		{
			if(value != null)
				addField(FLD_STREET, value);
		}

		public String getCITY()
		{
			return getField(FLD_CITY);
		}

		public void setCITY(String value)
		{
			if(value != null)
				addField(FLD_CITY, value);
		}

		public String getPOSTAL_CODE()
		{
			return getField(FLD_POSTAL_CODE);
		}

		public void setPOSTAL_CODE(String value)
		{
			if(value != null)
				addField(FLD_POSTAL_CODE, value);
		}

		public String getCOUNTRY()
		{
			return getField(FLD_COUNTRY);
		}

		public void setCOUNTRY(String value)
		{
			if(value != null)
				addField(FLD_COUNTRY, value);
		}

	}
}