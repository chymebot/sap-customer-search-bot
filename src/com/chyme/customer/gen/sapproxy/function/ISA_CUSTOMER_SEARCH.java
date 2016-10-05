//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.customer.gen.sapproxy.function;

import java.util.List;

import com.chyme.customer.gen.sapproxy.record.BAPIRETURN;
import com.chyme.customer.gen.sapproxy.record.CUSTOMER_FIND;
import com.chyme.customer.gen.sapproxy.table.CUSTOMER_FOUND_List;
import com.unvired.jco.Function;
import com.unvired.jco.meta.DataElementMeta;
import com.unvired.jco.meta.FieldMeta;
import com.unvired.jco.meta.FunctionDescriptor;
import com.unvired.jco.meta.ParameterMeta;
import com.unvired.jco.meta.StructureMeta;
import com.unvired.jco.meta.TableMeta;

public class ISA_CUSTOMER_SEARCH extends Function
{
	private static final long serialVersionUID = 1L;
	private static FunctionDescriptor funcDesc;

	static
	{
		funcDesc = new FunctionDescriptor("ISA_CUSTOMER_SEARCH","ISA_CUSTOMER_SEARCH");
		funcDesc.addParameter(new ParameterMeta(0, "ADDRESS_DATA", "",CUSTOMER_FIND.METADATA,0));
		funcDesc.addParameter(new ParameterMeta(1, "CUSTOMER_NUMBER", "", new DataElementMeta(0, "CUSTOMER_NUMBER", "",0,0),0));
		funcDesc.addParameter(new ParameterMeta(2, "DISTR_CHAN_RES", "", new DataElementMeta(0, "DISTR_CHAN_RES", "",0,0),0));
		funcDesc.addParameter(new ParameterMeta(3, "DIVISION_RES", "", new DataElementMeta(0, "DIVISION_RES", "",0,0),0));
		funcDesc.addParameter(new ParameterMeta(4, "EMAIL", "", new DataElementMeta(0, "EMAIL", "",0,0),0));
		funcDesc.addParameter(new ParameterMeta(5, "MAX_HITS", "", new DataElementMeta(6, "MAX_HITS", "",0,0),0));
		funcDesc.addParameter(new ParameterMeta(6, "OOB_SCENARIO", "", new DataElementMeta(0, "OOB_SCENARIO", "",0,0),0));
		funcDesc.addParameter(new ParameterMeta(7, "PARTNER", "", new DataElementMeta(0, "PARTNER", "",0,0),0));
		funcDesc.addParameter(new ParameterMeta(8, "PARVW", "", new DataElementMeta(0, "PARVW", "",0,0),0));
		funcDesc.addParameter(new ParameterMeta(9, "SALES_ORGANIZATION_RES", "", new DataElementMeta(0, "SALES_ORGANIZATION_RES", "",0,0),0));
		funcDesc.addParameter(new ParameterMeta(10, "TELEPHONE", "", new DataElementMeta(0, "TELEPHONE", "",0,0),0));
		funcDesc.addParameter(new ParameterMeta(11, "USER", "", new DataElementMeta(0, "USER", "",0,0),0));
		funcDesc.addParameter(new ParameterMeta(12, "RETURN", "",BAPIRETURN.METADATA,1));
		funcDesc.addParameter(new ParameterMeta(13, "CUSTOMERS_RESULTS", "",CUSTOMER_FOUND_List.METADATA,3));
	}

	public FunctionDescriptor getFunctionDescriptor()
	{
		return funcDesc;
	}

	public ISA_CUSTOMER_SEARCH() 
	{
		super("ISA_CUSTOMER_SEARCH");
	}

	public static void fetch(String parameterName)
	{
		ParameterMeta parameter = funcDesc.getParameter(parameterName);
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetch(String parameterName, String fieldName)
	{
		ParameterMeta parameter = funcDesc.getParameter(parameterName);
		if(parameter!=null)
		{
			List<FieldMeta> fieldMeta = null;
			if (parameter.getType() instanceof StructureMeta)
			{
				fieldMeta = ((StructureMeta)parameter.getType()).getFields();
			}
			else if(parameter.getType() instanceof TableMeta)
			{
				fieldMeta = ((TableMeta)parameter.getType()).getFields();
			}
			if(fieldMeta!=null)
			{
				for (FieldMeta field : fieldMeta)
				{
					field.setActive(true);
				}
			}
		}
	}

	public static void fetchADDRESS_DATA()
	{
		ParameterMeta parameter = funcDesc.getParameter("ADDRESS_DATA");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((StructureMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				field.setActive(true);
			}
		}
	}

	public static void fetchADDRESS_DATA(String fieldName)
	{
		ParameterMeta parameter = funcDesc.getParameter("ADDRESS_DATA");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((StructureMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				if(field.getName().equalsIgnoreCase(fieldName))
				{
					field.setActive(true);
					break;
				}
			}
		}
	}

	public static void fetchCUSTOMER_NUMBER()
	{
		ParameterMeta parameter = funcDesc.getParameter("CUSTOMER_NUMBER");
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetchDISTR_CHAN_RES()
	{
		ParameterMeta parameter = funcDesc.getParameter("DISTR_CHAN_RES");
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetchDIVISION_RES()
	{
		ParameterMeta parameter = funcDesc.getParameter("DIVISION_RES");
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetchEMAIL()
	{
		ParameterMeta parameter = funcDesc.getParameter("EMAIL");
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetchMAX_HITS()
	{
		ParameterMeta parameter = funcDesc.getParameter("MAX_HITS");
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetchOOB_SCENARIO()
	{
		ParameterMeta parameter = funcDesc.getParameter("OOB_SCENARIO");
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetchPARTNER()
	{
		ParameterMeta parameter = funcDesc.getParameter("PARTNER");
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetchPARVW()
	{
		ParameterMeta parameter = funcDesc.getParameter("PARVW");
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetchSALES_ORGANIZATION_RES()
	{
		ParameterMeta parameter = funcDesc.getParameter("SALES_ORGANIZATION_RES");
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetchTELEPHONE()
	{
		ParameterMeta parameter = funcDesc.getParameter("TELEPHONE");
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetchUSER()
	{
		ParameterMeta parameter = funcDesc.getParameter("USER");
		if(parameter!=null)
		{
			parameter.setActive(true);
		}
	}

	public static void fetchRETURN()
	{
		ParameterMeta parameter = funcDesc.getParameter("RETURN");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((StructureMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				field.setActive(true);
			}
		}
	}

	public static void fetchRETURN(String fieldName)
	{
		ParameterMeta parameter = funcDesc.getParameter("RETURN");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((StructureMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				if(field.getName().equalsIgnoreCase(fieldName))
				{
					field.setActive(true);
					break;
				}
			}
		}
	}

	public static void fetchCUSTOMERS_RESULTS()
	{
		ParameterMeta parameter = funcDesc.getParameter("CUSTOMERS_RESULTS");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((TableMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				field.setActive(true);
			}
		}
	}

	public static void fetchCUSTOMERS_RESULTS(String fieldName)
	{
		ParameterMeta parameter = funcDesc.getParameter("CUSTOMERS_RESULTS");
		parameter.setActive(true);
		List<FieldMeta> fieldMeta = ((TableMeta)parameter.getType()).getFields();
		if(fieldMeta!=null)
		{
			for (FieldMeta field : fieldMeta)
			{
				if(field.getName().equalsIgnoreCase(fieldName))
				{
					field.setActive(true);
					break;
				}
			}
		}
	}

	public CUSTOMER_FIND getADDRESS_DATA()
	{
		return (CUSTOMER_FIND)getValue(0);
	}

	public void setADDRESS_DATA(CUSTOMER_FIND value)
	{
		setValue(0,value);
	}

	public String getCUSTOMER_NUMBER(){
		return (String)getValue(1);
	}

	public void setCUSTOMER_NUMBER(String value){
		setValue(1,value);
	}

	public String getDISTR_CHAN_RES(){
		return (String)getValue(2);
	}

	public void setDISTR_CHAN_RES(String value){
		setValue(2,value);
	}

	public String getDIVISION_RES(){
		return (String)getValue(3);
	}

	public void setDIVISION_RES(String value){
		setValue(3,value);
	}

	public String getEMAIL(){
		return (String)getValue(4);
	}

	public void setEMAIL(String value){
		setValue(4,value);
	}

	public Long getMAX_HITS() {
		if(getValue(5)!=null)
			return Long.parseLong((String) getValue(5));
		else
			return null;
	}

	public void setMAX_HITS(Long value) {
		if(value!=null)
			setValue(5,value.toString());
	}

	public String getOOB_SCENARIO(){
		return (String)getValue(6);
	}

	public void setOOB_SCENARIO(String value){
		setValue(6,value);
	}

	public String getPARTNER(){
		return (String)getValue(7);
	}

	public void setPARTNER(String value){
		setValue(7,value);
	}

	public String getPARVW(){
		return (String)getValue(8);
	}

	public void setPARVW(String value){
		setValue(8,value);
	}

	public String getSALES_ORGANIZATION_RES(){
		return (String)getValue(9);
	}

	public void setSALES_ORGANIZATION_RES(String value){
		setValue(9,value);
	}

	public String getTELEPHONE(){
		return (String)getValue(10);
	}

	public void setTELEPHONE(String value){
		setValue(10,value);
	}

	public String getUSER(){
		return (String)getValue(11);
	}

	public void setUSER(String value){
		setValue(11,value);
	}

	public BAPIRETURN getRETURN()
	{
		return (BAPIRETURN)getValue(12);
	}

	public void setRETURN(BAPIRETURN value)
	{
		setValue(12,value);
	}

	public CUSTOMER_FOUND_List getCUSTOMERS_RESULTS()
	{
		return (CUSTOMER_FOUND_List)getValue(13);
	}

	public void setCUSTOMERS_RESULTS(CUSTOMER_FOUND_List value)
	{
		setValue(13,value);
	}

}