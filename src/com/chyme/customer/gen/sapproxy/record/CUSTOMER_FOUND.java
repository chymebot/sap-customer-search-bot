//	Generated using Unvired Modeller - Build R-4.000.0042
package com.chyme.customer.gen.sapproxy.record;

import com.unvired.jco.Structure;
import com.unvired.jco.meta.DataElementMeta;
import com.unvired.jco.meta.FieldMeta;
import com.unvired.jco.meta.StructureMeta;
public class CUSTOMER_FOUND extends Structure
{
	private static final long serialVersionUID = 1L;
	public static StructureMeta METADATA;

	static
	{
		METADATA = new StructureMeta("CUSTOMER_FOUND", "" );
		METADATA.setProxyClass("com.chyme.customer.gen.sapproxy.record.CUSTOMER_FOUND");
		METADATA.addField(new FieldMeta(0,"ADDR_TYPE",new DataElementMeta(0,"CHAR","Addresses: Address type",1,0)));
		METADATA.addField(new FieldMeta(1,"KUNNR",new DataElementMeta(0,"CHAR","Customer Number 1",10,0)));
		METADATA.addField(new FieldMeta(2,"PARNR",new DataElementMeta(6,"NUM","Number of contact person",10,0)));
		METADATA.addField(new FieldMeta(3,"NAME",new DataElementMeta(0,"CHAR","Name 1",40,0)));
		METADATA.addField(new FieldMeta(4,"FIRSTNAME",new DataElementMeta(0,"CHAR","First name",40,0)));
		METADATA.addField(new FieldMeta(5,"STREET",new DataElementMeta(0,"CHAR","Street",60,0)));
		METADATA.addField(new FieldMeta(6,"CITY1",new DataElementMeta(0,"CHAR","City",40,0)));
		METADATA.addField(new FieldMeta(7,"MC_NAME",new DataElementMeta(0,"CHAR","Name (field NAME1) in upper case for matchcode",25,0)));
		METADATA.addField(new FieldMeta(8,"MC_FIRSTNAME",new DataElementMeta(0,"CHAR","First name in upper case for search help",25,0)));
		METADATA.addField(new FieldMeta(9,"SORT1",new DataElementMeta(0,"CHAR","Search Term 1",20,0)));
		METADATA.addField(new FieldMeta(10,"SORT2",new DataElementMeta(0,"CHAR","Search Term 2",20,0)));
		METADATA.addField(new FieldMeta(11,"MC_CITY1",new DataElementMeta(0,"CHAR","City name in upper case for search help",25,0)));
		METADATA.addField(new FieldMeta(12,"POST_CODE1",new DataElementMeta(0,"CHAR","City postal code",10,0)));
		METADATA.addField(new FieldMeta(13,"MC_STREET",new DataElementMeta(0,"CHAR","Street name in upper case for search help",25,0)));
		METADATA.addField(new FieldMeta(14,"HOUSE_NUM1",new DataElementMeta(0,"CHAR","House Number",10,0)));
		METADATA.addField(new FieldMeta(15,"COUNTRY",new DataElementMeta(0,"CHAR","Country Key",3,0)));
		METADATA.addField(new FieldMeta(16,"REGION",new DataElementMeta(0,"CHAR","Region (State, Province, County)",3,0)));
		METADATA.addField(new FieldMeta(17,"NAME_L_LNG",new DataElementMeta(0,"CHAR","Last name",40,0)));
		METADATA.addField(new FieldMeta(18,"NAME_F_LNG",new DataElementMeta(0,"CHAR","First name",40,0)));
		METADATA.addField(new FieldMeta(19,"CITY1_LNG",new DataElementMeta(0,"CHAR","City",40,0)));
		METADATA.addField(new FieldMeta(20,"STREET_LNG",new DataElementMeta(0,"CHAR","Street",60,0)));
		METADATA.addField(new FieldMeta(21,"POST_CODE2",new DataElementMeta(0,"CHAR","PO Box postal code",10,0)));
		METADATA.addField(new FieldMeta(22,"PO_BOX",new DataElementMeta(0,"CHAR","PO Box",10,0)));
	}
	public StructureMeta getMetaData()
	{
		return METADATA;
	}
	public CUSTOMER_FOUND()
	{
		super(METADATA.getName(), METADATA.getDescription());
	}

	public String getADDR_TYPE(){
		return (String)getValue(0);
	}

	public void setADDR_TYPE(String value){
		setValue(0,value);
	}

	public String getKUNNR(){
		return (String)getValue(1);
	}

	public void setKUNNR(String value){
		setValue(1,value);
	}

	public Long getPARNR() {
		if(getValue(2)!=null)
			return Long.parseLong((String) getValue(2));
		else
			return null;
	}

	public void setPARNR(Long value) {
		if(value!=null)
			setValue(2,value.toString());
	}

	public String getNAME(){
		return (String)getValue(3);
	}

	public void setNAME(String value){
		setValue(3,value);
	}

	public String getFIRSTNAME(){
		return (String)getValue(4);
	}

	public void setFIRSTNAME(String value){
		setValue(4,value);
	}

	public String getSTREET(){
		return (String)getValue(5);
	}

	public void setSTREET(String value){
		setValue(5,value);
	}

	public String getCITY1(){
		return (String)getValue(6);
	}

	public void setCITY1(String value){
		setValue(6,value);
	}

	public String getMC_NAME(){
		return (String)getValue(7);
	}

	public void setMC_NAME(String value){
		setValue(7,value);
	}

	public String getMC_FIRSTNAME(){
		return (String)getValue(8);
	}

	public void setMC_FIRSTNAME(String value){
		setValue(8,value);
	}

	public String getSORT1(){
		return (String)getValue(9);
	}

	public void setSORT1(String value){
		setValue(9,value);
	}

	public String getSORT2(){
		return (String)getValue(10);
	}

	public void setSORT2(String value){
		setValue(10,value);
	}

	public String getMC_CITY1(){
		return (String)getValue(11);
	}

	public void setMC_CITY1(String value){
		setValue(11,value);
	}

	public String getPOST_CODE1(){
		return (String)getValue(12);
	}

	public void setPOST_CODE1(String value){
		setValue(12,value);
	}

	public String getMC_STREET(){
		return (String)getValue(13);
	}

	public void setMC_STREET(String value){
		setValue(13,value);
	}

	public String getHOUSE_NUM1(){
		return (String)getValue(14);
	}

	public void setHOUSE_NUM1(String value){
		setValue(14,value);
	}

	public String getCOUNTRY(){
		return (String)getValue(15);
	}

	public void setCOUNTRY(String value){
		setValue(15,value);
	}

	public String getREGION(){
		return (String)getValue(16);
	}

	public void setREGION(String value){
		setValue(16,value);
	}

	public String getNAME_L_LNG(){
		return (String)getValue(17);
	}

	public void setNAME_L_LNG(String value){
		setValue(17,value);
	}

	public String getNAME_F_LNG(){
		return (String)getValue(18);
	}

	public void setNAME_F_LNG(String value){
		setValue(18,value);
	}

	public String getCITY1_LNG(){
		return (String)getValue(19);
	}

	public void setCITY1_LNG(String value){
		setValue(19,value);
	}

	public String getSTREET_LNG(){
		return (String)getValue(20);
	}

	public void setSTREET_LNG(String value){
		setValue(20,value);
	}

	public String getPOST_CODE2(){
		return (String)getValue(21);
	}

	public void setPOST_CODE2(String value){
		setValue(21,value);
	}

	public String getPO_BOX(){
		return (String)getValue(22);
	}

	public void setPO_BOX(String value){
		setValue(22,value);
	}

}