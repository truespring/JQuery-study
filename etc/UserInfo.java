package com.doosan.test.prac;

public class UserInfo {

	public static void main(String[] args) {
		/***
		 *  ��ũ : http://chomman.github.io/blog/spring%20framework/spring-security%EB%A5%BC-%EC%9D%B4%EC%9A%A9%ED%95%98%EC%97%AC-%EC%82%AC%EC%9A%A9%EC%9E%90%EC%9D%98-%EC%A0%95%EB%B3%B4%EB%A5%BC-%EC%B0%BE%EB%8A%94-%EB%B0%A9%EB%B2%95/
		 *  
		 *  Object userObject = SecurityContextHolder.getContext().getAuthentication().getDetails();
		 *  SecurityContextHolder�� Spring Security Ŭ�����̸� ���� set���ִ� �κ��� ã�� ����
		 *  setContext() or setAuthentication()�� Ŭ������ ���������� ������Ʈ������ ����� ������ ���� �� ��
		 *  ���� getCurrentUserInfo() ��� �޼ҵ� ���� ������ �̰��� ���� ���� �α��� ���� ����� ������ �޴� �� ��
		 *  
		 *  ��ũ�� Spring Security�� �̿��Ͽ� ������� ������ ã�� �� �ִ� 3���� ����� �Ұ��ϰ� ����
		 *  1. SpringContextHolder�� �̿�
		 *  
		 *  2. Controller���� �޼��� ���ڷ� �޴� ���
		 *  
		 *  3. User Ŭ���� ����ȯ�Ͽ� ������ ��ȸ�ϴ� ��� (�̶� User Ŭ������ org.springframework.security.core.userdetails.User ��)
		 */
	}
}
