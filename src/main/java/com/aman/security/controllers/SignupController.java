package com.aman.security.controllers;

import com.aman.security.models.User;
import com.aman.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class SignupController {

//    @Autowired
//    private UserService userService;
//    @GetMapping("signin")
//    public ResponseEntity<List<User>> Signin(){
//
//        return ResponseEntity.ok(userService.getUsers());
//    }
}
