package com.doosan.test;

public class Boolean {

	public static void main(String[] args) {
		SampleVO vo = new SampleVO(); // �����ϴ� ��� �ּҰ��� ������ ����
		vo = null; // ������ ���� true false �����
		boolean isOk = isChk(vo);
		System.out.println(vo);
		System.out.println(isOk);
		
	}
	
	private static boolean isChk(SampleVO vo) {
		return vo == null;
	}
}
