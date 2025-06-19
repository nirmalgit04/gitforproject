package com.example.user.controller;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.user.bean.User;
import com.example.user.service.UserService;



@RestController
@RequestMapping("api/user")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    // Build save department REST API
    @PostMapping
    public ResponseEntity<User> saveDepartment(@RequestBody User user){
    	User savedDepartment = userService.saveUser(user);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    // Build get department rest api
    @GetMapping("{user-name}")
    public ResponseEntity<User> getDepartment(@PathVariable("user-name") String userName){
    	User user = userService.getUserByName(userName);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
