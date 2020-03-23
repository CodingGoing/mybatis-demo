package com.inglc.demo.controller;


import com.inglc.demo.service.AccountService;
import com.inglc.demo.service.dto.AccountDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/account")
@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/save")
	public ResponseEntity saveAccount(){
		AccountDTO accountDTO = new AccountDTO();
		accountDTO.setUsername("demo");
		accountDTO.setAddress("address Road");
		accountDTO.setPassword("demo password");
		accountDTO.setPhone("123-234-345");
		accountDTO.setStatus("normal");
		int rs = accountService.insertAccount(accountDTO);

		return ResponseEntity.ok(rs == 1 ? "create account success" : "create account fail");
	}

}
