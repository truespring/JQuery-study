package com.doosan.test.prac3;

import java.util.ArrayList;
import java.util.List;

import com.doosan.test.SampleVO;

public class StreamForeach {

	public static void main(String[] args) {
		List<Object[]> objArray = new ArrayList<>();
		Object[] objList = new Object[] {"aaa", "bbb"};
		objArray.add(objList);
		
		List<SampleVO> voList = new ArrayList<>();
		objArray.stream().forEach(item -> {
			Object[] data = item;
			SampleVO vo = new SampleVO();
			vo.setS(data[0].toString());
			vo.setStr(data[1].toString());
			voList.add(vo);
		});
	}
}
