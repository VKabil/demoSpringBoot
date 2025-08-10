package com.example.demoSpringBoot.service;


import com.example.demoSpringBoot.model.*;
import com.example.demoSpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //CREATE
    public User addUser(User user){
        return userRepository.save(user);
    }

    //READ
    public List<User> getUser(){
        return userRepository.findAll();
    }

    //Update
    public User updateUser(Long Id, User updateduser){
        Optional<User> existingUser = userRepository.findById(Id);
        if(existingUser.isPresent()){
            User user = existingUser.get();
            user.setName(updateduser.getName());
            user.setEmail(updateduser.getEmail());
            user.setAge(updateduser.getAge());
            return userRepository.save(user);
        }
        return null;
    }

    //Delete
    public String deleteUser(Long id){
        userRepository.deleteById(id);
        return "User deleted by Id "+id;
    }

    //UserGetByID
    public User getByID(Long id){
        return userRepository.findById(id).orElse(null);
    }
}
