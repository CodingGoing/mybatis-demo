package com.inglc.demo.domain;

import java.io.Serializable;
import java.math.BigInteger;
import lombok.Data;


@Data
public class Account implements Serializable {


  private static final long serialVersionUID = 3098394634395544940L;

  private BigInteger accountId;
  private String username;
  private String password;
  private String status;
  private String address;
  private String phone;
}
