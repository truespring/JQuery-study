package com.doosan.test.prac;

public class ChkPassword {
	
	public static void main(String[] args) {
//		boolean isChk = checkPassword("!Q@W3e4r5t");
//		System.out.println(isChk);

		String sChar = "-_=+\\|()*&^%$#@!~`?></;,.:'";
		String password = "-231?3";
		int a = password.charAt(3); // �ش� �ε����� ���ڸ� �ƶ��Ƽ��ڷ� ��ȯ�Ѵ�.
		int b = sChar.indexOf(a); // �ش� �Ǽ��� �������� ������ -1, �����ϸ� �ش� ������ index�� ��ȯ�Ѵ�.
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
					sChar_Count++; // Ư�� ���� ���ԵǾ� �ִ���
				}
				if (alpha.indexOf(password.charAt(i)) != -1) {
					alphaCheck = true; // ���� ��ҹ��� ������� ���ԵǾ� �ִ���
				}
				if (number.indexOf(password.charAt(i)) != -1) {
					numberCheck = true; // ���� ���ԵǾ� �ִ���
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
