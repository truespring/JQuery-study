package com.doosan.test;

import java.util.Map;

public class SampleVO {

	private String s;
	private int num;
	private String str;
	private Double height;
	private Map<String, Object> map;
	
	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public SampleVO() {
		super();
	}

	public SampleVO(String s, int num, String str) {
		super();
		this.s = s;
		this.num = num;
	}
		
	public SampleVO(String s, int num, String str, Map<String, Object> map) {
		super();
		this.s = s;
		this.num = num;
		this.str = str;
		this.map = map;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	@Override
	public String toString() {
		return String.format("{s=%s, num=%d, str=%s, map=%s}", this.s, this.num, this.str, this.map);
	}
}
