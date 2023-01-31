package com.exchange.security;

import com.exchange.model.User;
import com.exchange.repo.UserRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

  @Autowired
  private UserRepo repo;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
   // Busca al usuario que se esta logueando

    User user = repo.findOneByUsername(username);
    if(user == null){
      throw new UsernameNotFoundException("User not found");
    }

    List<GrantedAuthority> roles = new ArrayList<>();
    String role = user.getRole().getName();
    roles.add(new SimpleGrantedAuthority(role));

    return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),roles);

  }
}
