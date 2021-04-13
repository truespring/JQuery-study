package com.doosan.test.prac;

public class ChkPassword {
	
	public static void main(String[] args) {
//		boolean isChk = checkPassword("!Q@W3e4r5t");
//		System.out.println(isChk);

		String sChar = "-_=+\\|()*&^%$#@!~`?></;,.:'";
		String password = "-231?3";
		int a = password.charAt(3); // 해당 인덱스의 문자를 아라비아숫자로 반환한다.
		int b = sChar.indexOf(a); // 해당 실수가 존재하지 않으면 -1, 존재하면 해당 문자의 index를 반환한다.
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static boolean checkPassword(String password) {
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String number = "1234567890";
		String sChar = "-_=+\\|()*&^%$#@!~`?></;,.:'";

		int sChar_Count = 0;
		boolean alphaCheck = false;
		boolean numberCheck = false;

		if (8 <= password.length() && password.length() <= 64) {
			for (int i = 0; i < password.length(); i++) {
				if (sChar.indexOf(password.charAt(i)) != -1) {
					sChar_Count++; // 특수 문자 포함되어 있는지
				}
				if (alpha.indexOf(password.charAt(i)) != -1) {
					alphaCheck = true; // 영문 대소문자 상관없이 포함되어 있는지
				}
				if (number.indexOf(password.charAt(i)) != -1) {
					numberCheck = true; // 숫자 포함되어 있는지
				}
			}
			if (sChar_Count < 1 || !alphaCheck || !numberCheck) {
				return false;
			}
		} else {
			return false;
		}
		return true;
	}
}
