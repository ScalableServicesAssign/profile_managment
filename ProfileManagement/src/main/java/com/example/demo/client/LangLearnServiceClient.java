package com.example.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.LangLearnResponseDto;
import com.example.demo.dto.LangLearnResponseSubDto;


@Component
public class LangLearnServiceClient {
	@Autowired
	private RestTemplate template;
	
	public LangLearnResponseDto fetchlanguageStatus(String langId) {
		 System.out.println("Calling lang_learnings service for langId: " + langId);
        return template.getForObject("http://langlearn/profilelang/" + langId, LangLearnResponseDto.class);
    }
	
	public LangLearnResponseSubDto fetchlanguageSubType(String langId) {
		 System.out.println("Calling lang_learnings service for langId: " + langId);
       return template.getForObject("http://langlearn/profilelang/sub/" + langId, LangLearnResponseSubDto.class);
   }
	

}
