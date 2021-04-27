package com.doosan.test.exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HumanUtil {
	// 파일이 저장될 경로
	public static final String path = "./human.ser";
	
	// Object 저장 메소드
	public static void write(Human human) {
		try {
			FileOutputStream fo = new FileOutputStream(path);
			ObjectOutputStream out = new ObjectOutputStream(fo);
			out.writeObject(human);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Object 불러오는 메소드
	public static Human read() {
		Human human;
		
		try {
			FileInputStream fi = new FileInputStream(path);
			ObjectInputStream in = new ObjectInputStream(fi);
			human = (Human) in.readObject();
			in.close();
			return human;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
