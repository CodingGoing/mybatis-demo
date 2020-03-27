package com.inglc.demo.controller;


import com.inglc.demo.mapper.entity.Account;
import com.inglc.demo.service.AccountService;
import com.inglc.demo.service.dto.AccountDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
		Account account = new Account();
		account.setName("demo");
		account.setEmail("who@ami.com");
		account.setPassword("demo password");
		account.setAddress("address Road");
		account.setPhone("123-234-345");
		account.setCountry("USA");
		int rs = accountService.insertAccount(account);

		return ResponseEntity.ok(rs == 1 ? "create account success" : "create account fail");
	}


	@GetMapping("/write/list")
	public ResponseEntity getAllWrite(){
		return ResponseEntity.ok(accountService.getAllAccountWrite());
	}

	@GetMapping("/read/list")
	public ResponseEntity getAllRead(){
		return ResponseEntity.ok(accountService.getAllAccountRead());
	}

}
