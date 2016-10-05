//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.customer.gen.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import com.chyme.customer.gen.be.BE_SearchCustomer;
import com.chyme.customer.gen.be.CUSTOMER;
import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class BEUtility
{
	public static List<BE_SearchCustomer> getBE_SearchCustomer(List<BusinessEntity> beList)
	{
		ArrayList<BE_SearchCustomer> typedBEs = new ArrayList<BE_SearchCustomer>();

		if(beList != null)
		{
			for (BusinessEntity be : beList)
			{
				if(be.getName().equals(BE_SearchCustomer.NAME))
				{
					BE_SearchCustomer typedBE = new BE_SearchCustomer();
					typedBEs.add(typedBE);
					for (Entry<String, String> field : be.getHeader().getFieldsInOrder().entrySet())
					{
						typedBE.getHeader().addField(field.getKey(), field.getValue());
					}

					//	Process each item individually
					for (Structure item : be.getItems())
					{
					}
				}
			}
		}
		return typedBEs;
	}

	public static List<CUSTOMER> getCUSTOMER(List<BusinessEntity> beList)
	{
		ArrayList<CUSTOMER> typedBEs = new ArrayList<CUSTOMER>();

		if(beList != null)
		{
			for (BusinessEntity be : beList)
			{
				if(be.getName().equals(CUSTOMER.NAME))
				{
					CUSTOMER typedBE = new CUSTOMER();
					typedBEs.add(typedBE);
					for (Entry<String, String> field : be.getHeader().getFieldsInOrder().entrySet())
					{
						typedBE.getHeader().addField(field.getKey(), field.getValue());
					}

					//	Process each item individually
					for (Structure item : be.getItems())
					{
					}
				}
			}
		}
		return typedBEs;
	}

}