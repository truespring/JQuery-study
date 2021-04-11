package com.doosan.test.prac;

import java.util.Optional;

public class OptionalTest {
	
	public static void main(String[] args) {
		/**
		 * ��ũ : http://www.tcpschool.com/java/java_stream_optional
		 * ��ũ2 : http://homoefficio.github.io/2019/10/03/Java-Optional-%EB%B0%94%EB%A5%B4%EA%B2%8C-%EC%93%B0%EA%B8%B0/
		 * 
		 * Optional<T> Ŭ������ integer�� Double Ŭ����ó�� 'T'Ÿ�� ��ü�� ������ �ִ� ���� Ŭ����(Wrapper class)�̴�.
		 * ���� Optional �ν��Ͻ��� ��� Ÿ���� ���� ������ ������ �� �ִ�.
		 * �̷��� Optional ��ü�� ����ϸ� ����ġ ���� NullPointerException ���ܸ� �����ϴ� �޼ҵ�� ������ ȸ���� �� �ִ�.
		 * ��, ������ ���ǹ� ���̵� ��(Null)������ ���� �߻��ϴ� ���ܸ� ó���� �� �ִ�.
		 */
		
		// Optional ��ü�� ����
		/**
		 * of() �޼ҵ峪 ofNullable() �޼ҵ带 ����Ͽ� Optional ��ü�� ������ �� �ִ�.
		 * 
		 * of() �޼ҵ�� null�� �ƴ� ��õ� ���� ������ Optional ��ü�� ��ȯ�Ѵ�.
		 * ���� of() �޼ҵ带 ���� ������ Optional ��ü�� null�� ����Ǹ� NullPointerException ���ܰ� �߻��Ѵ�.
		 * 
		 * ���� ���� ���� ������ ���� ���� �ϳ� null�� �� ���ɼ��� �ִٸ�, ofNullable() �޼ҵ带 ����Ͽ� Optional ��ü�� �����ϴ� ���� ����.
		 * ofNullable() �޼ҵ�� ��õ� ���� null�� �ƴϸ� ��õ� ���� ������ Optional ��ü�� ��ȯ�ϸ�, ��õ� ���� null�̸� ����ִ� Optional ��ü�� ��ȯ�Ѵ�.
		 */
		String str = "�ڹ� Optional ��ü";
//		str = null;
		Optional<String> opt = Optional.ofNullable(str);
		System.out.println(opt.get());
		
		// Optional ��ü�� ����
		/**
		 * get() �޼ҵ带 ����ϸ� Optional ��ü�� ����� ���� ������ �� �ִ�.
		 * ���� Optional ��ü�� ����� ���� null�̸�, NoSuchElementException ���ܰ� �߻��Ѵ�.
		 * ���� get() �޼ҵ带 ȣ���ϱ� ���� isPresent() �޼ҵ带 ����ϸ� Optional ��ü�� ����� ���� null���� �ƴ����� ���� Ȯ���� �� ȣ���ϴ� ���� ����.
		 */
		String str_2 = "�ڹ� Optional ��ü";
//		str_2 = null;
		Optional<String> opt_2 = Optional.ofNullable(str_2);
		if(opt_2.isPresent()) {
			System.out.println(opt_2.get());
		}
		
		/**
		 * ���� �޼ҵ带 ����Ͽ� null ��ſ� ��ü�� ���� ������ ���� �ִ�.
		 * 
		 * 1. orElse() : ����� ���� �����ϸ� �� ���� ��ȯ�ϰ�, ���� �������� ������ �μ��� ���޵� ���� ��ȯ�Ѵ�.
		 * 2. orElseGet() : ����� ���� �����ϸ� �� ���� ��ȯ�ϰ�, ���� �������� ������ �μ��� ���޵� ���� ǥ������ ������� ��ȯ�Ѵ�.
		 * 3. orElseThrow() : ����� ���� �����ϸ� �� ���� ��ȯ�ϰ�, ���� �������� ������ �μ��� ���޵� ���ܸ� �߻���Ų��.
		 */
		Optional<String> opt_3 = Optional.empty(); // Optional�� null�� �ʱ�ȭ
		System.out.println(opt_3.orElse("�� Optional ��ü"));
		System.out.println(opt_3.orElseGet(String::new)); // opt_3�� ���� ���� ���� new String ����
		
		
		
	}
}
