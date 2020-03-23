
package com.inglc.demo.mapper;

import com.inglc.demo.domain.Account;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountMapper {

  int insertAccount(Account account);

}
