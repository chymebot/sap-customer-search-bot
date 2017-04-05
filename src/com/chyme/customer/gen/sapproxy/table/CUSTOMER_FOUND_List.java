//	Generated using Unvired Modeller - Build R-4.000.0042
package com.chyme.customer.gen.sapproxy.table;

import java.util.Enumeration;
import java.util.Vector;

import com.chyme.customer.gen.sapproxy.record.CUSTOMER_FOUND;
import com.unvired.jco.Table;
import com.unvired.jco.meta.DataElementMeta;
import com.unvired.jco.meta.FieldMeta;
import com.unvired.jco.meta.TableMeta;

public class CUSTOMER_FOUND_List extends Table
{
	private static final long serialVersionUID = 1L;
	public static TableMeta METADATA;

	static
	{
		METADATA = new TableMeta("CUSTOMER_FOUND","");
		METADATA.setProxyClass("com.chyme.customer.gen.sapproxy.table.CUSTOMER_FOUND_List");
		METADATA.setProxyRecClass("com.chyme.customer.gen.sapproxy.record.CUSTOMER_FOUND");
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

	public TableMeta getMetaData()
	{
		return METADATA;
	}

	public CUSTOMER_FOUND_List()
	{
		super(METADATA.getName(), METADATA.getDescription());
	}

	public void addRecord(CUSTOMER_FOUND record)
	{
		super.addRecord(record);
	}

	public Enumeration getRecordList()
	{
		Object val = value;
		return ((Vector) val).elements();
	}

}