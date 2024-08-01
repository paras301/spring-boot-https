package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.vo.ApiRequest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApiService{
	public String testApi(ApiRequest req) {
		log.info("API is hit");
		return "API HIT MESSAGE: " + req.getData() ;
	}

}
