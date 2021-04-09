package org.sam.blog.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import org.sam.blog.model.User;
import org.sam.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user")
    public @ResponseBody List<User> findAll(){
        List<User> users = userService.findAll();
        return users;
    }

    @PostMapping(value = "/user")
    public @ResponseBody User createUser (){
        User user1 = new User("buiviet","1234","bui@gmail.com");
        return userService.save(user1);
    }

    @GetMapping(value = "/user/{id}")
   public Optional<User> findUserById( ){
        return userService.findById(1);
    }

}
