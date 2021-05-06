package com.doosan.test.prac3;

public class Jquery {
	/**
	 *  var pamMappingSeq = pv.getPamMappingSeqFromModelingKey(modelingKey) - pv는 공통함수
		var model = $("[data-pam-mapping-seq=" + pamMappingSeq + "]"); - jQuery 를 이용하여 해당 요소의 정보를 모두 가져옴 (배열) 

		for(var j=0 ; j < model.length; j++){
			if(result=="true"){
				if(model.eq(j).find("span").eq(1).css("background-image").indexOf("stop") > -1){ - stop 문자열이 있으면 실행
					model.eq(j).find("span").eq(1).css("background-image", "url(/images/dataStudio/play/play_icon_model.png)");
				}
			} else {
				if(model.eq(j).find("span").eq(1).css("background-image").indexOf("play") > -1){
					model.eq(j).find("span").eq(1).css("background-image", "url(/images/dataStudio/stop/stop_icon_model.png)");
				}
			}
		}
		
		var modelingKey = modelingData.modelingKey;
		var pamMappingSeq = pv.getPamMappingSeqFromModelingKey(modelingKey);
		var model = $("[data-pam-mapping-seq=" + pamMappingSeq + "]");

		for(var j=0 ; j <model.length; j++){
			if (model.eq(j).find(".show-modeling-history").css("background-color") != 'rgb(76, 210, 255)') {
				model.eq(j).find(".show-modeling-history").css("background-color", 'rgb(76, 210, 255)');
			}
		}
	 */

}
