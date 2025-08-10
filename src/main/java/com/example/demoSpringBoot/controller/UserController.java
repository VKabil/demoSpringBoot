package com.example.demoSpringBoot.controller;


import com.example.demoSpringBoot.model.*;
import com.example.demoSpringBoot.repository.UserRepository;
import com.example.demoSpringBoot.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    UserService userService;

    //CREATE
    @PostMapping
    public ResponseEntity<User> addUser(@Valid @RequestBody User user){
        return ResponseEntity.ok(userService.addUser(user));
    }

    //Read
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok(userService.getUser());
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user){
        return ResponseEntity.ok(userService.updateUser(id, user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        return ResponseEntity.ok(userService.deleteUser(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> userGetById(@PathVariable Long id){
        User user = userService.getByID(id);
        if(user != null){
            return ResponseEntity.ok(user);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

}
