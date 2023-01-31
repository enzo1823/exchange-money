package com.exchange.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// clase 3
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest {

  private String username;
  private String password;
}
