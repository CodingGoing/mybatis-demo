package com.inglc.demo.service.dto;

import java.io.Serializable;
import java.math.BigInteger;
import lombok.Data;


@Data
public class AccountDTO implements Serializable {


  private static final long serialVersionUID = -5100054095840962712L;

  private BigInteger accountId;
  private String username;
  private String password;
  private String status;
  private String address;
  private String phone;

}
