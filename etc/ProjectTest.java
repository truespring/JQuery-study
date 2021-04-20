package com.doosan.test.prac2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.doosan.test.SampleVO;

public class ProjectTest {
	
	public static void main(String[] args) {
		Map<String, Integer> testMap = new HashMap<>();
		List<SampleVO> sampleArray = new ArrayList<>();
		SampleVO vo = new SampleVO("1", 2, "3");
		SampleVO vo2 = new SampleVO("2", 2, "3");
		SampleVO vo3 = new SampleVO("3", 2, "3");
		sampleArray.add(vo);
//		sampleArray.add(vo);
//		sampleArray.add(vo);
		sampleArray.add(vo2);
		sampleArray.add(vo3);

		// sample.getS() �� ���� �� ���� ���ڿ��� �ִ��� ������ Ȯ���ϴ� ����
		for(SampleVO sample : sampleArray) {
			Integer count = testMap.get(sample.getS());;
			System.out.println(count);
			if(count == null) {
				count = 0;
			}
			count++; // ������ count �� ��� ������. �ٸ��� �ʱ�ȭ�Ǿ��ٰ� �����. 
			testMap.put(sample.getS(), count);
			System.out.println(count);
		}
		try {
			JSONObject json = new JSONObject();
			JSONParser jsonParser = new JSONParser();
			JSONArray jsonArray = (JSONArray) jsonParser.parse(vo.getS());
			json.put("jsonArray", jsonArray);
			json.put("size", Integer.toString(jsonArray.size()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// �⺻ �ڷ���
		String str_1 = "apple";
		String str_2 = "apple";
		// ������
		String str_3 = new String("apple");
		String str_4 = new String("apple");
		
		printResult(str_1 == str_2);
		printResult(str_1.equals(str_2));
		printResult(str_3 == str_1);
		printResult(str_3.equalsIgnoreCase("AppLE")); // ��ҹ��� ���� ����
		
	}
	
	public static void printResult(boolean result) {
		if(result)
			System.out.println("����");
		else
			System.out.println("�ٸ���");
	}
}
