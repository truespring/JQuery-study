package com.doosan.test.prac3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * application.yml 에 저장된 값을 load 하는 방법
 * getProperty 를 할때 json 타입의 key 를 입력
 * 될 수도 있고 안될 수도 있음
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
	 * 		Step 은 Spring Batch 에 있는 클래스
	 * }
	 */
}
