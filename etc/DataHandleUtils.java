package com.doosan.test.prac4;

import java.util.Objects;

public class DataHandleUtils {

	private DataHandleUtils() {
		super();
	}

	public static Boolean objectToBoolean(Object object) {
		Boolean booleanObject = null;
		try {
			booleanObject = Boolean.parseBoolean(object.toString());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return booleanObject;
	}

	public static Integer objectToInt(Object object) {
		Integer integer = null;
		try {
			integer = Integer.parseInt(object.toString());
		} catch (NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		}
		return integer;
	}

	public static Long objectToLong(Object object) {
		Long longObject = null;
		try {
			longObject = Long.parseLong(object.toString());
		} catch (NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		}
		return longObject;
	}

	public static Double objectToDouble(Object object) {
		Double doubleObject = null;
		try {
			doubleObject = Double.parseDouble(object.toString());
		} catch (NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		}
		return doubleObject;
	}

	public static String objectToString(Object object) {
		if (Objects.nonNull(object)) {
			return object.toString();
		} else {
			return null;
		}
	}

	/**
	 * 두 인자가 null 이거나 같다면 true, 아니라면 false
	 * 
	 * @param o1
	 * @param o2
	 * @return
	 */
	public static boolean isEqualObject(Object o1, Object o2) {
		boolean isA = Objects.isNull(o1);
		boolean isB = Objects.isNull(o2);
		if (isA || isB) {
			if (isA && isB) {
				return true;
			} else {
				return false;
			}
		} else {
			if (o1.equals(o2)) {
				return true;
			} else {
				return false;
			}
		}
	}

}
