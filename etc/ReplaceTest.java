package com.doosan.test.prac2;

public class ReplaceTest {

	public static void main(String[] args) {
		
		/**
		 * ��ũ : https://djusti.tistory.com/8
		 * replace�� replaceAll ����
		 * replace : Ư�� ���ڿ��� ���ϴ� ���ڿ��� ġȯ�ϴ� �޼ҵ�
		 * replaceAll : ��Ư�� ���ڿ��� ���ϴ� ���ڿ��� ġȯ�ϴ� �޼ҵ�, ���Խ��� ����� �� �ִ�. [] : ���Խ� ǥ�� 
		 */
		String str1 = "aaa1";
		String result1 = str1.replace("1", ""); // aaa
		String result2 = str1.replaceAll("1", ""); // aaa
		
		String str2 = "aaabbbccccabcddddabcdeeee";
		  
		String result3 = str2.replace("abc", "��"); // aaabbbcccc��dddd��deeee
		String result4 = str2.replaceAll("[abc]", "��"); // �տտտտտտտտտտտտ�dddd�տտ�deeee
		String result5 = str2.replace("a", "��").replace("b", "��").replace("c", "��"); // �տտտտտտտտտտտտ�dddd�տտ�deeee
		
		String str3 = "testa1testbccc2testccc3";
		str3 = str3.replaceAll("[^0-9]", ""); // ���ڰ� �ƴ� ���� ���� ���ڿ��� ġȯ��, 123
		
		String str4 = "testa1testbccc2testccc3";
		str4 = str4.replaceAll("[0-9]", ""); // ���ڸ� ���� ���ڿ��� ġȯ��, testatestbccctestccc
		
	}
}
