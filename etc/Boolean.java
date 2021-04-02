package com.doosan.test;

public class Boolean {

	public static void main(String[] args) {
		SampleVO vo = new SampleVO(); // 생성하는 즉시 주소값을 가지고 있음
		vo = null; // 유무에 따라 true false 변경됨
		boolean isOk = isChk(vo);
		System.out.println(vo);
		System.out.println(isOk);
		
	}
	
	private static boolean isChk(SampleVO vo) {
		return vo == null;
	}
}
