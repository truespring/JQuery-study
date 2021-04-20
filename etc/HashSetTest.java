package com.doosan.test.prac2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// ��ũ : https://coding-factory.tistory.com/554
		HashSet<Integer> set1 = new HashSet<Integer>(); // HashSet ����
		HashSet<Integer> set2 = new HashSet<>(); // new ���� Ÿ�� �Ķ���� ���� ����
		HashSet<Integer> set3 = new HashSet<Integer>(set1); // set1 �� ��� ���� ���� HashSet ����
		HashSet<Integer> set4 = new HashSet<Integer>(10); // �ʱ� �뷮(capacity) ����
		HashSet<Integer> set5 = new HashSet<Integer>(10, 0.7f); // �ʱ� capacity, load factor ����
		HashSet<Integer> set6 = new HashSet<Integer>(Arrays.asList(1,2,3)); // �ʱⰪ ����
		
		HashSet<Integer> set7 = new HashSet<Integer>();
		set7.add(1); // �� �߰�
		set7.add(2);
		set7.add(3);
		
		HashSet<Integer> set8 = new HashSet<Integer>(Arrays.asList(1,2,3)); // �ʱⰪ ����
		set8.remove(1); // �� 1 ����
		set8.clear(); // ��� �� ����
		
		HashSet<Integer> set9 = new HashSet<Integer>(Arrays.asList(1,2,3)); // �ʱⰪ ����
		System.out.println(set9.size()); // set ũ�� : 3
		
		HashSet<Integer> set10 = new HashSet<Integer>(Arrays.asList(1,2,3)); // �ʱⰪ ����
		System.out.println(set10); // ��ü ��� [1,2,3]
		Iterator iter = set10.iterator(); // Iterator ���
		while(iter.hasNext()) { // ���� ������ true, ���� ������ false
			System.out.println(iter.next());
		}

		HashSet<Integer> set11 = new HashSet<Integer>(Arrays.asList(1,2,3)); // �ʱⰪ ����
		System.out.println(set11.contains(1)); // set ���ο� �� 1�� �ִ��� Ȯ�� : true
	}
}
