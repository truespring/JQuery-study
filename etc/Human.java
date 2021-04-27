package com.doosan.test.exception;

import java.io.Serializable;

public class Human implements Serializable {

	// serialVersionUID 는 직렬회(implements Serializable) 를 할 떄 사용한다.
	// serialVersionUID 를 지정하지 않으면 컴파일러가 계산한 값을 부여한다. 그렇다면 컴파일러에 따라 할당되는 값이 다를 수 있다는 뜻
	// 컴파일러는 Serializable Class 혹은 Outer Class 를 참고하여 만들기 때문에 만약 클래스에 변경이 있으면 serialVersionUID 도 변경이 있을 수 있다.
	
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
