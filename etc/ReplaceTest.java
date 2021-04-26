package com.doosan.test.prac2;

public class ReplaceTest {

	public static void main(String[] args) {
		
		/**
		 * ¸µÅ© : https://djusti.tistory.com/8
		 * replace¿Í replaceAll »ç¿ë¹ý
		 * replace : Æ¯Á¤ ¹®ÀÚ¿­À» ¿øÇÏ´Â ¹®ÀÚ¿­·Î Ä¡È¯ÇÏ´Â ¸Þ¼Òµå
		 * replaceAll : ºÒÆ¯Á¤ ¹®ÀÚ¿­À» ¿øÇÏ´Â ¹®ÀÚ¿­·Î Ä¡È¯ÇÏ´Â ¸Þ¼Òµå, Á¤±Ô½ÄÀ» »ç¿ëÇÒ ¼ö ÀÖ´Ù. [] : Á¤±Ô½Ä Ç¥Çö 
		 */
		String str1 = "aaa1";
		String result1 = str1.replace("1", ""); // aaa
		String result2 = str1.replaceAll("1", ""); // aaa
		
		String str2 = "aaabbbccccabcddddabcdeeee";
		  
		String result3 = str2.replace("abc", "¿Õ"); // aaabbbcccc¿Õdddd¿Õdeeee
		String result4 = str2.replaceAll("[abc]", "¿Õ"); // ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õdddd¿Õ¿Õ¿Õdeeee
		String result5 = str2.replace("a", "¿Õ").replace("b", "¿Õ").replace("c", "¿Õ"); // ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õ¿Õdddd¿Õ¿Õ¿Õdeeee
		
		String str3 = "testa1testbccc2testccc3";
		str3 = str3.replaceAll("[^0-9]", ""); // ¼ýÀÚ°¡ ¾Æ´Ñ °ªÀº ÀüºÎ ºó¹®ÀÚ¿­·Î Ä¡È¯ÇÔ, 123
		
		String str4 = "testa1testbccc2testccc3";
		str4 = str4.replaceAll("[0-9]", ""); // ¼ýÀÚ¸¦ ÀüºÎ ºó¹®ÀÚ¿­·Î Ä¡È¯ÇÔ, testatestbccctestccc
		
	}
}
