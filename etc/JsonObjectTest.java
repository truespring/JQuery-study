package com.doosan.test.prac;

import org.json.simple.JSONObject;

public class JsonObjectTest {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("one", 1);
		jsonObject.put("one", 2); // µ¤¾î¾º¾îÁø´Ù.
		System.out.println(jsonObject);
		String jsonStr = jsonObject.toJSONString();
		System.out.println(jsonStr);
	}
}
