package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.client.LangLearnServiceClient;
import com.example.demo.dto.LangLearnResponseDto;
import com.example.demo.dto.LangLearnResponseSubDto;

@Service
public class LangLearnService {

	@Autowired
    private LangLearnServiceClient langServiceClient;

    public String greeting() {
        return "Welcome to language learning App Service";
    }

    public LangLearnResponseDto checkOrderStatus(String langId) {
        return langServiceClient.fetchlanguageStatus(langId);
    }
    
    public LangLearnResponseSubDto checkOrderSubType(String langId) {
        return langServiceClient.fetchlanguageSubType(langId);
    }
}
