package com.doosan.test.exception;

public class Impl {

	public static void main(String[] args) {
		// ��� ��ü ���� �� ���� �Ҵ�
		Human human = new Human();
		human.setName("Seok");
		human.setAge(31);
		
		// ��ü ����
//		HumanUtil.write(human);
		
		// ��ü �ҷ�����
		Human human2 = HumanUtil.read();
		System.out.println(human2.toString());
	}
}
