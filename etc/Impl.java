package com.doosan.test.exception;

public class Impl {

	public static void main(String[] args) {
		// 사람 객체 생성 및 정보 할당
		Human human = new Human();
		human.setName("Seok");
		human.setAge(31);
		
		// 객체 저장
//		HumanUtil.write(human);
		
		// 객체 불러오기
		Human human2 = HumanUtil.read();
		System.out.println(human2.toString());
	}
}
