
package com.inglc.demo.service;

import com.inglc.demo.mapper.entity.Account;
import java.util.List;


public interface AccountService {

  int insertAccount(Account account);

  List<Account> getAllAccountWrite();

  List<Account> getAllAccountRead();
}
