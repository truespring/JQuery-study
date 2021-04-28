package com.doosan.test.prac3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListArrayTest {

	public static void main(String[] args) {
		String str = new String(); 
		str = "String_Object";
		Object[] obj =  str.split("_");
		str = "String2_Object";
		Object[] obj2 =  str.split("_");
		
		List<Object[]> objList = new ArrayList<>();
		objList.add(obj);
		objList.add(obj2);
		
		HashMap<String, Object> map = new HashMap<>();
		objList.stream().forEach(item -> {
			map.put((String) item[0], item[1]);
		});
		
		System.out.println(map);
		System.out.println(map.get("String").toString());
	}
}
