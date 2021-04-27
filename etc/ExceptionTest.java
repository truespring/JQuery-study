package com.doosan.test.prac2;

public class ExceptionTest {

	public static void main(String[] args) throws CommonException {
		/**
		 * 링크 : https://www.nextree.co.kr/p3239/
		 * 오류(Error) : 시스템에 비정상적인 상황이 생겼을 때 발생한다. 
		 * 				이는 시스템 레벨에서 발생하기 때문에 심각한 수준의 오류이다.
		 * 				개발자가 미리 예측하여 처리할 수 없기 때문에, 애플리케이션에서 오류에 대한 처리를 신경 쓰지 않아도 된다
		 * 예외(Exception) : 개발자가 구현한 로직에서 발생항다. 예외는 발생할 상황을 미리 예측하여 처리할 수 있다.
		 */
		String str = null;
		ExceptionTest et = new ExceptionTest();
		et.test(str);
	}
	
	public String test(String str) throws CommonException {
		if(str == null) {
			throw new CommonException("Null!");
		}
		return str;
	}
}
