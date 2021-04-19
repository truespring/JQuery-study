package com.doosan.test.prac2;

import java.util.List;

public class EnumTest {
	// ��ũ : https://opentutorials.org/course/2517/14151
	enum Fruit {
		Apple, Peach, Banana;
		/*public*/ Fruit() {
			System.out.println("Call Constructor " + this);
		}
		/**
		 * Call Constructor Apple
		 * Call Constructor Peach
		 * Call Constructor Banana
		 * ������ Fruit �� ȣ���Ǿ��� ������ ��µ� ��. �ʵ��� ���ڸ�ŭ ȣ��ȴ�. enum �� �����ڸ� ���� �� �ִ�.
		 * enum �� �����ڰ� ���� ������ private ���� ����ϱ� ������ public �� ������� �ʰ�, Fruit �� ���� ������ �� ����.
		 */
	}
	
	enum Company {
		Google, Apple, Oracle;
	}
	
	public static void main(String[] args) {
	
//		if(Fruit.Apple == Company.Apple) {
//			System.out.print("����� ȸ��� ����.");
//		}
		// enum �� ���� �ٸ� ��� �׷쿡 ���� �񱳸� ������ �������� ������ �� �ִ�
		
		Fruit type = Fruit.Apple;
		switch(type) {
		case Apple:
			System.out.println(57 + " kcal"); // �����
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
