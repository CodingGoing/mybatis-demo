
package com.inglc.demo.service.impl;


import com.inglc.demo.mapper.entity.Account;
import com.inglc.demo.mapper.read.AccountReadMapper;
import com.inglc.demo.mapper.write.AccountWriteMapper;
import com.inglc.demo.service.AccountService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

  @Autowired
  AccountWriteMapper accountWriteMapper;
  @Autowired
  AccountReadMapper accountReadMapper;


  @Override
  public int insertAccount(Account Account) {
    return accountWriteMapper.insertAccount(Account);
  }

  @Override
  public List<Account> getAllAccountWrite() {
    return accountWriteMapper.getAllAccount();
  }

  @Override
  public List<Account> getAllAccountRead() {
    return accountReadMapper.getAllAccount();
  }
}
