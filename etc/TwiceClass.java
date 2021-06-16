package com.doosan.test.prac4;

public class TwiceClass {

	public static class CoreProperties {
		private SampleVo vo;
		public CoreProperties(SampleVo vo) {
			this.vo = vo;
		}
		
		public int getAge() {
			return vo.getAge();
		}
		
		public void setAge(int age) {
			vo.setAge(age);
		}
	}
}
