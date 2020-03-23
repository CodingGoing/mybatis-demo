
package com.inglc.demo.service.impl;


import com.inglc.demo.domain.Account;
import com.inglc.demo.mapper.AccountMapper;
import com.inglc.demo.service.AccountService;
import com.inglc.demo.service.dto.AccountDTO;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

  @Autowired
  AccountMapper accountMapper;


  @Override
  public int insertAccount(AccountDTO accountDTO) {
    if (Objects.isNull(accountDTO)){
      log.error("accountDTO param is null");
      return 0;
    }
    Account account = new Account();
    BeanUtils.copyProperties(accountDTO, account);
    return accountMapper.insertAccount(account);
  }

}
