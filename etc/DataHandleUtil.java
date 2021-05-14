package com.doosan.test.prac3;

public class DataHandleUtil {
	
	public static Double objectToDouble(Object object) {
		Double doubleObject = null;
		try {
			doubleObject = Double.parseDouble(object.toString());
		} catch (NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		}
		return doubleObject;
	}

}
