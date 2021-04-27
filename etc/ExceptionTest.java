package com.doosan.test.prac2;

public class ExceptionTest {

	public static void main(String[] args) throws CommonException {
		/**
		 * ��ũ : https://www.nextree.co.kr/p3239/
		 * ����(Error) : �ý��ۿ� ���������� ��Ȳ�� ������ �� �߻��Ѵ�. 
		 * 				�̴� �ý��� �������� �߻��ϱ� ������ �ɰ��� ������ �����̴�.
		 * 				�����ڰ� �̸� �����Ͽ� ó���� �� ���� ������, ���ø����̼ǿ��� ������ ���� ó���� �Ű� ���� �ʾƵ� �ȴ�
		 * ����(Exception) : �����ڰ� ������ �������� �߻��״�. ���ܴ� �߻��� ��Ȳ�� �̸� �����Ͽ� ó���� �� �ִ�.
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
