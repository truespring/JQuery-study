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

		// sample.getS() 를 했을 때 같은 문자열이 있는지 없는지 확인하는 로직
		for(SampleVO sample : sampleArray) {
			Integer count = testMap.get(sample.getS());;
			System.out.println(count);
			if(count == null) {
				count = 0;
			}
			count++; // 같으면 count 가 계속 더해짐. 다르면 초기화되었다가 진행됨. 
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
		
	}
}
