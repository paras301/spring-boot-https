package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ApiService;
import com.example.demo.vo.ApiRequest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
@Slf4j
public class ApiController {
	@Autowired
	ApiService apiService;
	
	@PostMapping(value = "/execute")
	public String applyMapping(@RequestBody ApiRequest req)  {
		log.debug("Recieved Request == " + req);
		return apiService.testApi(req);
	}
}
