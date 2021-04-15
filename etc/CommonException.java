package com.doosan.test.prac;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonException extends Exception {
	/**
	 * ��ũ : https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.30
	 * ��ũ���� �ܺζ��̺귯���� �޾ƾ� �� 
	 */
	private static final long serialVersionUID = -6124459025372348072L;

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private final String defaultErrorMessage = "Reason not specified.";

	public CommonException() {
		super();

		log.error(defaultErrorMessage);
	}

	public CommonException(String message) {
		super(message);
		log.error(message);
	}

	public CommonException(String message, Throwable cause) {
		super(message, cause);
		log.error(message, cause);
	}

	public CommonException(Throwable cause) {
		super(cause);
		log.error(defaultErrorMessage, cause);
	}
}
