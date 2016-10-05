//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.customer.gen.sapproxy.record;

import com.unvired.jco.Structure;
import com.unvired.jco.meta.DataElementMeta;
import com.unvired.jco.meta.FieldMeta;
import com.unvired.jco.meta.StructureMeta;
public class CUSTOMER_FIND extends Structure
{
	private static final long serialVersionUID = 1L;
	public static StructureMeta METADATA;

	static
	{
		METADATA = new StructureMeta("CUSTOMER_FIND", "" );
		METADATA.setProxyClass("com.chyme.customer.gen.sapproxy.record.CUSTOMER_FIND");
		METADATA.addField(new FieldMeta(0,"MC_NAME",new DataElementMeta(0,"CHAR","Name (field NAME1) in upper case for matchcode",25,0)));
		METADATA.addField(new FieldMeta(1,"MC_FIRSTNAME",new DataElementMeta(0,"CHAR","First name in upper case for search help",25,0)));
		METADATA.addField(new FieldMeta(2,"SORT1",new DataElementMeta(0,"CHAR","Search Term 1",20,0)));
		METADATA.addField(new FieldMeta(3,"SORT2",new DataElementMeta(0,"CHAR","Search Term 2",20,0)));
		METADATA.addField(new FieldMeta(4,"MC_CITY1",new DataElementMeta(0,"CHAR","City name in upper case for search help",25,0)));
		METADATA.addField(new FieldMeta(5,"POST_CODE1",new DataElementMeta(0,"CHAR","City postal code",10,0)));
		METADATA.addField(new FieldMeta(6,"MC_STREET",new DataElementMeta(0,"CHAR","Street name in upper case for search help",25,0)));
		METADATA.addField(new FieldMeta(7,"HOUSE_NUM1",new DataElementMeta(0,"CHAR","House Number",10,0)));
		METADATA.addField(new FieldMeta(8,"COUNTRY",new DataElementMeta(0,"CHAR","Country Key",3,0)));
		METADATA.addField(new FieldMeta(9,"REGION",new DataElementMeta(0,"CHAR","Region (State, Province, County)",3,0)));
		METADATA.addField(new FieldMeta(10,"NAME_L_LNG",new DataElementMeta(0,"CHAR","Last name",40,0)));
		METADATA.addField(new FieldMeta(11,"NAME_F_LNG",new DataElementMeta(0,"CHAR","First name",40,0)));
		METADATA.addField(new FieldMeta(12,"CITY1_LNG",new DataElementMeta(0,"CHAR","City",40,0)));
		METADATA.addField(new FieldMeta(13,"STREET_LNG",new DataElementMeta(0,"CHAR","Street",60,0)));
	}
	public StructureMeta getMetaData()
	{
		return METADATA;
	}
	public CUSTOMER_FIND()
	{
		super(METADATA.getName(), METADATA.getDescription());
	}

	public String getMC_NAME(){
		return (String)getValue(0);
	}

	public void setMC_NAME(String value){
		setValue(0,value);
	}

	public String getMC_FIRSTNAME(){
		return (String)getValue(1);
	}

	public void setMC_FIRSTNAME(String value){
		setValue(1,value);
	}

	public String getSORT1(){
		return (String)getValue(2);
	}

	public void setSORT1(String value){
		setValue(2,value);
	}

	public String getSORT2(){
		return (String)getValue(3);
	}

	public void setSORT2(String value){
		setValue(3,value);
	}

	public String getMC_CITY1(){
		return (String)getValue(4);
	}

	public void setMC_CITY1(String value){
		setValue(4,value);
	}

	public String getPOST_CODE1(){
		return (String)getValue(5);
	}

	public void setPOST_CODE1(String value){
		setValue(5,value);
	}

	public String getMC_STREET(){
		return (String)getValue(6);
	}

	public void setMC_STREET(String value){
		setValue(6,value);
	}

	public String getHOUSE_NUM1(){
		return (String)getValue(7);
	}

	public void setHOUSE_NUM1(String value){
		setValue(7,value);
	}

	public String getCOUNTRY(){
		return (String)getValue(8);
	}

	public void setCOUNTRY(String value){
		setValue(8,value);
	}

	public String getREGION(){
		return (String)getValue(9);
	}

	public void setREGION(String value){
		setValue(9,value);
	}

	public String getNAME_L_LNG(){
		return (String)getValue(10);
	}

	public void setNAME_L_LNG(String value){
		setValue(10,value);
	}

	public String getNAME_F_LNG(){
		return (String)getValue(11);
	}

	public void setNAME_F_LNG(String value){
		setValue(11,value);
	}

	public String getCITY1_LNG(){
		return (String)getValue(12);
	}

	public void setCITY1_LNG(String value){
		setValue(12,value);
	}

	public String getSTREET_LNG(){
		return (String)getValue(13);
	}

	public void setSTREET_LNG(String value){
		setValue(13,value);
	}

}