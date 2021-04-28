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
		
		// ��ũ : https://tourspace.tistory.com/8
		ArrayList<String> foods = new ArrayList<>();
		foods.add("����");
		foods.add("ġŲ");
		foods.add("�ܹ���");
		foods.add("����");
		foods.add("�Ұ��");
		str = String.join(", ", foods);
		System.out.println(str); // ����, ġŲ, �ܹ���, ����, �Ұ��
		str = foods.stream().collect(Collectors.joining(", "));
		System.out.println(str); // ����, ġŲ, �ܹ���, ����, �Ұ��
		
		String [] color = new String[] {"����", "���", "�Ķ�", "�ʷ�"};
		str = String.join(", ", color);
		System.out.println(str); // ����, ���, �Ķ�, �ʷ�
	}
}
