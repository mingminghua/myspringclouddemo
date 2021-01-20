package com.sourthwind.controller;

import com.sourthwind.model.User;
import com.sourthwind.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author Ming
 * @Description
 * @create 2021-01-19 15:40
 */
@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public Collection<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Long id){
        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public Collection<User> save(@RequestBody User user){
        userRepository.saveOrUpdate(user);
        return userRepository.findAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){
        userRepository.saveOrUpdate(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        userRepository.deleteById(id);
    }
}