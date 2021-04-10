package org.sam.blog.controller;

import org.sam.blog.model.User;
import org.sam.blog.service.UserService;
import org.sam.blog.utils.HttpMessageStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user")
    public HttpMessageStatus findAll(){
        HttpMessageStatus httpMessageStatus = new HttpMessageStatus(HttpStatus.OK.value(), HttpStatus.OK,null, userService.findAll());
        return httpMessageStatus;
    }

    @PostMapping(value = "/user")
    public  HttpMessageStatus createUser (@RequestBody User user ){
        HttpMessageStatus httpMessageStatus = new HttpMessageStatus(HttpStatus.OK.value(), HttpStatus.OK,null,userService.save(user));
        return httpMessageStatus;
    }

    @GetMapping(value = "/user/{id}")
   public Optional<User> findUserById( @PathVariable Integer id  ){
        return userService.findById(id);
    }

}
