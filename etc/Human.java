package com.doosan.test.exception;

import java.io.Serializable;

public class Human implements Serializable {

	// serialVersionUID �� ����ȸ(implements Serializable) �� �� �� ����Ѵ�.
	// serialVersionUID �� �������� ������ �����Ϸ��� ����� ���� �ο��Ѵ�. �׷��ٸ� �����Ϸ��� ���� �Ҵ�Ǵ� ���� �ٸ� �� �ִٴ� ��
	// �����Ϸ��� Serializable Class Ȥ�� Outer Class �� �����Ͽ� ����� ������ ���� Ŭ������ ������ ������ serialVersionUID �� ������ ���� �� �ִ�.
	
	private static final long serialVersionUID = -6184044926029805156L;
//	private static final long serialVersionUID = -6124459025372348072L;

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return new StringBuffer("Name : ").append(this.name).append(", Age : ").append(this.age).toString();
	}
}
