package com.doosan.test.exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HumanUtil {
	// ������ ����� ���
	public static final String path = "./human.ser";
	
	// Object ���� �޼ҵ�
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
	
	// Object �ҷ����� �޼ҵ�
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
