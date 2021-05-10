package com.windy.webflux.controller;

import com.windy.webflux.entity.User;
import com.windy.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author windyStreet
 * @codetime 2021-05-10 16:16
 */

@RestController
public class UserController {
    // 注入service
    @Autowired
    private UserService userService;
    // id 查询
    @GetMapping("/user/{id}")
    public Mono<User> getUserById(@PathVariable int id ){
        return userService.getUserByID(id);
    }
    // 查询所有
    @GetMapping("/user")
    public Flux<User> getUsers(){
        return userService.getAllUser();
    }
    // 添加
    @PostMapping("/saveuser")
    public Mono<Void> saveUser(@RequestBody User user){
        Mono<User> userMono = Mono.just(user);
        return userService.saveUserInfo(userMono);
    }

}
