package com.doosan.test.prac2;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONtest {

	public static void main(String[] args) {
		String str = "{\"aaaa\" : 1, \"a\" : 2}";
		JSONParser parser = new JSONParser();
		try {
			JSONObject dataJson = (JSONObject) parser.parse(str); // ���ڿ��� json �����̸� ����ȯ �� ��밡���ϴ�.
			System.out.println(dataJson.get("aaaa"));
			System.out.println(dataJson.get("a"));
		} catch (ParseException | ClassCastException | NullPointerException e) {
			e.printStackTrace();
		}
	}
}
