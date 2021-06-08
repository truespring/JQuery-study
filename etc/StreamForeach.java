package com.doosan.test.prac3;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import com.doosan.test.SampleVO;

public class StreamForeach {

	public static void main(String[] args) {
		List<Object[]> objArray = new ArrayList<>();
		Object[] objList = new Object[] {"aaa", "bbb", 5D};
		Object[] objList2 = new Object[] {"aaa", "bbb", 3D};
		objArray.add(objList);
		objArray.add(objList2);
		
		List<SampleVO> voList = new ArrayList<>();
		objArray.forEach(item -> {
			Object[] data = item;
			SampleVO vo = new SampleVO();
			vo.setS(data[0].toString());
			vo.setStr(data[1].toString());
			vo.setHeight(Double.parseDouble(data[2].toString()));
			System.out.println(vo.toString());
			voList.add(vo);
		});
		
		DoubleSummaryStatistics predictValueStatistics = voList.stream().filter(item -> item != null && item.getHeight() != null).mapToDouble(SampleVO::getHeight).summaryStatistics();
		// DoubleSummaryStatistics{count=2, sum=8.000000, min=3.000000, average=4.000000, max=5.000000}
		System.out.println(predictValueStatistics);
		
		Integer a = 1;
		Long b = 1L;
		Double c = 1D;
		a++;
		b++;
		c++;
		System.out.println(a + " " + b + " " + c);
	}
}
