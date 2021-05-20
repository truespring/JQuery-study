package com.doosan.test.prac3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * application.yml �� ����� ���� load �ϴ� ���
 * getProperty �� �Ҷ� json Ÿ���� key �� �Է�
 * �� ���� �ְ� �ȵ� ���� ����
 * 
 * @author kyuhwan.seok
 * 
 */
class PropertiesTest {

	static {
		Properties prop = new Properties();
		String path = "";
		InputStream inputStream = PropertiesTest.class.getClassLoader().getResourceAsStream("application.yml");
		try {
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		path = prop.getProperty("naver.key");
		System.load(path);
	}
}

// import org.springframework.batch.core.Step;

//@Configuration
class Test2 {
//	@Value("${naver.key}")
	private String key;
	
	/*
	 * public Step step(
	 * 		Step �� Spring Batch �� �ִ� Ŭ����
	 * }
	 */
}
