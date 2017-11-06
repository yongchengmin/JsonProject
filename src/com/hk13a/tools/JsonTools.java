package com.hk13a.tools;

import net.sf.json.JSONObject;

public class JsonTools
{

	public JsonTools()
	{
	}

	public static String getCreateJson(String key, Object value)
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put(key, value);

		return jsonObject.toString();
	}

}