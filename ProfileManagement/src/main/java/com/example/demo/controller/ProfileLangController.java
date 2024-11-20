package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LangLearnResponseDto;
import com.example.demo.dto.LangLearnResponseSubDto;
import com.example.demo.service.LangLearnService;



@RestController
@RequestMapping("/profilelang")
public class ProfileLangController {

	@Autowired
	private LangLearnService langSer;
	
	 @GetMapping("/greet")
	    public String greetingMessage() {
	        return langSer.greeting();
	    }
	 
	 
	 @GetMapping("/{langId}")
	    public LangLearnResponseDto getOrder(@PathVariable String langId) {
	        return langSer.checkOrderStatus(langId);
	    }
	 
	 @GetMapping("/sub/{langId}")
	    public LangLearnResponseSubDto getSubOrder(@PathVariable String langId) {
	        return langSer.checkOrderSubType(langId);
	    }
	
}
