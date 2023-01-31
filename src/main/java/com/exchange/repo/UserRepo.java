package com.exchange.repo;

import com.exchange.model.User;


public interface UserRepo extends GenericRepo<User, Integer> {

 User findOneByUsername(String username);
}
