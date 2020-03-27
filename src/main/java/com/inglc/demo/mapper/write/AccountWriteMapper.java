package com.inglc.demo.mapper.write;


import com.inglc.demo.mapper.entity.Account;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountWriteMapper {


	int insertAccount(Account account);

	List<Account> getAllAccount();

}
