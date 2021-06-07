package com.doosan.test.prac3;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import com.doosan.test.SampleVO;

public class StreamForeach {

	public static void main(String[] args) {
		List<Object[]> objArray = new ArrayList<>();
		Object[] objList = new Object[] {"aaa", "bbb"};
		objArray.add(objList);
		
		List<SampleVO> voList = new ArrayList<>();
		objArray.forEach(item -> {
			Object[] data = item;
			SampleVO vo = new SampleVO();
			vo.setS(data[0].toString());
			vo.setStr(data[1].toString());
			vo.setHeight(123D);
			voList.add(vo);
		});
		
		DoubleSummaryStatistics predictValueStatistics = voList.stream().filter(item -> item != null && item.getHeight() != null).mapToDouble(SampleVO::getHeight).summaryStatistics();
		// DoubleSummaryStatistics{count=1, sum=123.000000, min=123.000000, average=123.000000, max=123.000000}
		System.out.println(predictValueStatistics);
	}
}
