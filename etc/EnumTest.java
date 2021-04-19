package com.doosan.test.prac2;

import java.util.List;

public class EnumTest {
	// ¸µÅ© : https://opentutorials.org/course/2517/14151
	enum Fruit {
		Apple, Peach, Banana;
		/*public*/ Fruit() {
			System.out.println("Call Constructor " + this);
		}
		/**
		 * Call Constructor Apple
		 * Call Constructor Peach
		 * Call Constructor Banana
		 * »ý¼­ÀÚ Fruit °¡ È£­‹µÇ¾ú±â ¶§¹®¿¡ Ãâ·ÂµÈ °Í. ÇÊµåÀÇ ¼ýÀÚ¸¸Å­ È£ÃâµÈ´Ù. enum Àº »ý¼ºÀÚ¸¦ °¡Áú ¼ö ÀÖ´Ù.
		 * enum ÀÇ »ý¼ºÀÚ°¡ Á¢±Ù Á¦¾îÀÚ private ¸¸À» Çã¿ëÇÏ±â ¶§¹®¿¡ public À» Çã¿ëÇÏÁö ¾Ê°í, Fruit ¸¦ Á÷Á¢ »ý¼ºÇÒ ¼ö ¾ø´Ù.
		 */
	}
	
	enum Company {
		Google, Apple, Oracle;
	}
	
	public static void main(String[] args) {
	
//		if(Fruit.Apple == Company.Apple) {
//			System.out.print("»ç°ú¿Í È¸»ç´Â °°´Ù.");
//		}
		// enum ÀÌ ¼­·Î ´Ù¸¥ »ó¼ö ±×·ì¿¡ ´ëÇÑ ºñ±³¸¦ ÄÄÆÄÀÏ ½ÃÁ¡¿¡¼­ Â÷´ÜÇÒ ¼ö ÀÖ´Ù
		
		Fruit type = Fruit.Apple;
		switch(type) {
		case Apple:
			System.out.println(57 + " kcal"); // ½ÇÇàµÊ
			break;
		case Peach:
			System.out.println(34 + "kcal");
			break;
		case Banana:
			System.out.println(93 + "kcal");
			break;
		}
	}
}

class EnumTest2 {
	enum Fruit {
		Apple("red"), Peach("pink"), Banana("yellow");
		public String color;
		Fruit(String color) {
			System.out.println("Call Constructor " + this);
			this.color = color;
		}
		String getColor() {
			return this.color;
		}
	}
	
	public static void main(String[] args) {
		
		Fruit type = Fruit.Apple;
		switch(type) {
		case Apple:
			System.out.println(57 + " kcal, " + Fruit.Apple.getColor());
			break;
		case Peach:
			System.out.println(34 + "kcal, " + Fruit.Peach.getColor());
			break;
		case Banana:
			System.out.println(93 + "kcal, " + Fruit.Banana.getColor());
			break;
		}
		
		for(Fruit f : Fruit.values()) {
			System.out.println(f + ", " + f.getColor());
		}
		Fruit[] fruitArr = Fruit.values();
	}
}
