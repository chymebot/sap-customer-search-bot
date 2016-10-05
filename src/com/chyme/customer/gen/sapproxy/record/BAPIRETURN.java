//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.customer.gen.sapproxy.record;

import com.unvired.jco.Structure;
import com.unvired.jco.meta.DataElementMeta;
import com.unvired.jco.meta.FieldMeta;
import com.unvired.jco.meta.StructureMeta;
public class BAPIRETURN extends Structure
{
	private static final long serialVersionUID = 1L;
	public static StructureMeta METADATA;

	static
	{
		METADATA = new StructureMeta("BAPIRETURN", "" );
		METADATA.setProxyClass("com.chyme.customer.gen.sapproxy.record.BAPIRETURN");
		METADATA.addField(new FieldMeta(0,"TYPE",new DataElementMeta(0,"CHAR","Message type: S Success, E Error, W Warning, I Info, A Abort",1,0)));
		METADATA.addField(new FieldMeta(1,"CODE",new DataElementMeta(0,"CHAR","Message code",5,0)));
		METADATA.addField(new FieldMeta(2,"MESSAGE",new DataElementMeta(0,"CHAR","Message Text",220,0)));
		METADATA.addField(new FieldMeta(3,"LOG_NO",new DataElementMeta(0,"CHAR","Application log: log number",20,0)));
		METADATA.addField(new FieldMeta(4,"LOG_MSG_NO",new DataElementMeta(6,"NUM","Application log: Internal message serial number",6,0)));
		METADATA.addField(new FieldMeta(5,"MESSAGE_V1",new DataElementMeta(0,"CHAR","Message Variable",50,0)));
		METADATA.addField(new FieldMeta(6,"MESSAGE_V2",new DataElementMeta(0,"CHAR","Message Variable",50,0)));
		METADATA.addField(new FieldMeta(7,"MESSAGE_V3",new DataElementMeta(0,"CHAR","Message Variable",50,0)));
		METADATA.addField(new FieldMeta(8,"MESSAGE_V4",new DataElementMeta(0,"CHAR","Message Variable",50,0)));
	}
	public StructureMeta getMetaData()
	{
		return METADATA;
	}
	public BAPIRETURN()
	{
		super(METADATA.getName(), METADATA.getDescription());
	}

	public String getTYPE(){
		return (String)getValue(0);
	}

	public void setTYPE(String value){
		setValue(0,value);
	}

	public String getCODE(){
		return (String)getValue(1);
	}

	public void setCODE(String value){
		setValue(1,value);
	}

	public String getMESSAGE(){
		return (String)getValue(2);
	}

	public void setMESSAGE(String value){
		setValue(2,value);
	}

	public String getLOG_NO(){
		return (String)getValue(3);
	}

	public void setLOG_NO(String value){
		setValue(3,value);
	}

	public Long getLOG_MSG_NO() {
		if(getValue(4)!=null)
			return Long.parseLong((String) getValue(4));
		else
			return null;
	}

	public void setLOG_MSG_NO(Long value) {
		if(value!=null)
			setValue(4,value.toString());
	}

	public String getMESSAGE_V1(){
		return (String)getValue(5);
	}

	public void setMESSAGE_V1(String value){
		setValue(5,value);
	}

	public String getMESSAGE_V2(){
		return (String)getValue(6);
	}

	public void setMESSAGE_V2(String value){
		setValue(6,value);
	}

	public String getMESSAGE_V3(){
		return (String)getValue(7);
	}

	public void setMESSAGE_V3(String value){
		setValue(7,value);
	}

	public String getMESSAGE_V4(){
		return (String)getValue(8);
	}

	public void setMESSAGE_V4(String value){
		setValue(8,value);
	}

}