package com.doosan.test.prac3;

public class Jquery {
	/**
	 *  var pamMappingSeq = pv.getPamMappingSeqFromModelingKey(modelingKey) - pv�� �����Լ�
		var model = $("[data-pam-mapping-seq=" + pamMappingSeq + "]"); - jQuery �� �̿��Ͽ� �ش� ����� ������ ��� ������ (�迭) 

		for(var j=0 ; j < model.length; j++){
			if(result=="true"){
				if(model.eq(j).find("span").eq(1).css("background-image").indexOf("stop") > -1){ - stop ���ڿ��� ������ ����
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
