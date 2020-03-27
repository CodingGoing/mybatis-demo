package com.inglc.demo.mapper.read;

import com.inglc.demo.mapper.entity.Account;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountReadMapper {

	List<Account> getAllAccount();
}
