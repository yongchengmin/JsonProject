package com.hk13a.method;

import com.hk13a.service.JsonService;
import com.hk13a.tools.JsonTools;

public class JsonTest
{

	public JsonTest()
	{
	}

	public static void main(String[] args)
	{
//		 JsonService jsonService = new JsonService();
//		 PersonModel personModel = jsonService.getPerson();
//		 String strJson = JsonTools.getCreateJson("Person", personModel);
//
//		 JSONObject jsonObject = JSONObject.fromObject(personModel);
		//PersonList.json
//		 String strJson = JsonTools.getCreateJson("PersonList", new JsonService().getPersonList());
//		 String strJson = JsonTools.getCreateJson("ListString", new JsonService().getListString());
//		 String strJson = JsonTools.getCreateJson("ListString", new JsonService().getMapString());
		String strJson = JsonTools.getCreateJson("ListMap", new JsonService().getListMap());

		System.out.println(strJson);
	}

}