package com.doosan.test.prac;

public class UserInfo {

	public static void main(String[] args) {
		/***
		 *  링크 : http://chomman.github.io/blog/spring%20framework/spring-security%EB%A5%BC-%EC%9D%B4%EC%9A%A9%ED%95%98%EC%97%AC-%EC%82%AC%EC%9A%A9%EC%9E%90%EC%9D%98-%EC%A0%95%EB%B3%B4%EB%A5%BC-%EC%B0%BE%EB%8A%94-%EB%B0%A9%EB%B2%95/
		 *  
		 *  Object userObject = SecurityContextHolder.getContext().getAuthentication().getDetails();
		 *  SecurityContextHolder는 Spring Security 클래스이며 따로 set해주는 부분을 찾지 못함
		 *  setContext() or setAuthentication()은 클래스에 존재하지만 프로젝트내에서 사용한 흔적은 없는 듯 함
		 *  현재 getCurrentUserInfo() 라는 메소드 내에 있으며 이것을 통해 현재 로그인 중인 사용자 정보를 받는 듯 함
		 *  
		 *  링크에 Spring Security를 이용하여 사용자의 정보를 찾을 수 있는 3가지 방법을 소개하고 있음
		 *  1. SpringContextHolder를 이용
		 *  
		 *  2. Controller에서 메서드 인자로 받는 방법
		 *  
		 *  3. User 클래스 형변환하여 정보를 저회하는 방법 (이때 User 클래스는 org.springframework.security.core.userdetails.User 임)
		 */
	}
}
