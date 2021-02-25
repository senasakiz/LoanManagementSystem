package com.example.demo.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.IBlackListService;
import com.example.demo.entities.concretes.BlackList;

@RestController
@RequestMapping("/api/v1")
public class BlackListController {
	
	@Autowired
	IBlackListService blackListService;
	
	@GetMapping("/black_list")
	public List<BlackList> getAll(){
		return blackListService.getAll();
	}
	
	@GetMapping("/black_list/{customer_id}")
	public Optional<BlackList> getById(@PathVariable(value="customer_id")BlackList blackList){
		return blackListService.getById(blackList);
	}
	
	@PostMapping("/black_list")
	public BlackList add(@RequestBody BlackList blackList) {
		return blackListService.addToBlackList(blackList);
		
	}

}
