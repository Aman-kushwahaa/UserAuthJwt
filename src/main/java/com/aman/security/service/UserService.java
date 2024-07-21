package com.aman.security.service;

import com.aman.security.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    private List<User> users = new ArrayList<>();

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
}

//    private void addUsers(){
//        String encodedPassword = passwordEncoder.encode("123");
//        users.add(new User("Aman", encodedPassword));
//
//        logger.info("Users added :1st User {}", users.get(0));
//    }
//
//    public List<User> getUsers(){
//        addUsers();
//        return users;
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
//        return builder.getAuthenticationManager();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//
//        UserDetails user = org.springframework.security.core.userdetails.User.builder()
//                .username("Aman")
//                .password(passwordEncoder.encode("123"))
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(user);
//    }
//}