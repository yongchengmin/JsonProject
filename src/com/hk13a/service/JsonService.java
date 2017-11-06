package com.hk13a.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hk13a.model.PersonModel;

public class JsonService
{

	public JsonService()
	{
	}

	public PersonModel getPerson()
	{
		PersonModel personMDL = new PersonModel(1, "hacker13A", "aa", "bb", "cc·", "hacker13a@163.com", "86017974");
		return personMDL;
	}

	public List<PersonModel> getPersonList()
	{
		List<PersonModel> list = new ArrayList<PersonModel>();
		for (int i = 1; i <= 5; i++)
		{

			PersonModel personMDL = new PersonModel();

			personMDL.setUserId(i);
			personMDL.setUserName("hacker13A" + i);
			personMDL.setUserNick("xx" + i);
			personMDL.setUserPosition("cc" + i);
			personMDL.setUserAddress("dd" + i);
			personMDL.setUserEmail("hacker13" + i + "@163.com");
			personMDL.setUserQq("8601797" + i);

			list.add(personMDL);
		}

		return list;
	}

	public List<String> getListString()
	{
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		//{"ListString":["aa","bb"]}
		return list;
	}
	public Map<String, Object> getMapString(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("UserId", 1);
		map.put("UserName", "hacker13A" + 1);
		//{"ListString":{"UserName":"hacker13A1","UserId":1}}
		return map;
	}
	public List<Map<String, Object>> getListMap()
	{
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		// Map<String, Object> map = new HashMap<String, Object>();
		for (int i = 1; i <= 5; i++)
		{
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("UserId", i);
			map.put("UserName", "hacker13A" + i);

			list.add(map);
		}
		return list;
		/***
		 * {
				"ListMap":
				[
					{"UserName":"hacker13A1","UserId":1},
					{"UserName":"hacker13A2","UserId":2},
					{"UserName":"hacker13A3","UserId":3},
					{"UserName":"hacker13A4","UserId":4},
					{"UserName":"hacker13A5","UserId":5}
				]
			}
		 */
	}

}