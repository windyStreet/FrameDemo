package com.windy.webflux.service;

import com.windy.webflux.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author windyStreet
 * @codetime 2021-05-10 16:04
 */
public interface UserService {

    // 根据id查询用户
    Mono<User> getUserByID(int id);

    // 查询所有用户
    Flux<User> getAllUser();

    // 添加用户
    Mono<Void> saveUserInfo(Mono<User> userMono);
}
