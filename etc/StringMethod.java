package com.doosan.test.prac3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.doosan.test.SampleVO;

public class StringMethod {

	public static void main(String[] args) {
		SampleVO vo = new SampleVO();
		List<SampleVO> voList = new ArrayList<SampleVO>();
		vo.setNum(1);
		vo.setS("2");
		vo.setStr("3");
		voList.add(vo);
		voList.add(vo);
		String str = "";
		str = "a" + String.join(", ", voList.stream()
						  .map(item -> item.getNum() + ", " 
								  + item.getS() + ", "
								  + item.getStr()).collect(Collectors.toList()));
		System.out.println(str); // a1, 2, 3, 1, 2, 3
		System.out.println("======================");
		
		// ¸µÅ© : https://tourspace.tistory.com/8
		ArrayList<String> foods = new ArrayList<>();
		foods.add("ÇÇÀÚ");
		foods.add("Ä¡Å²");
		foods.add("ÇÜ¹ö°Å");
		foods.add("»ï°ã»ì");
		foods.add("¼Ò°í±â");
		str = String.join(", ", foods);
		System.out.println(str); // ÇÇÀÚ, Ä¡Å², ÇÜ¹ö°Å, »ï°ã»ì, ¼Ò°í±â
		str = foods.stream().collect(Collectors.joining(", "));
		System.out.println(str); // ÇÇÀÚ, Ä¡Å², ÇÜ¹ö°Å, »ï°ã»ì, ¼Ò°í±â
		
		String [] color = new String[] {"»¡°­", "³ë¶û", "ÆÄ¶û", "ÃÊ·Ï"};
		str = String.join(", ", color);
		System.out.println(str); // »¡°­, ³ë¶û, ÆÄ¶û, ÃÊ·Ï
	}
}
