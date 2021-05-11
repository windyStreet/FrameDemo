package com.windy.webflux.service.impl;

import com.windy.webflux.entity.User;
import com.windy.webflux.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @author windyStreet
 * @codetime 2021-05-10 16:07
 */

@Service
public class UserServiceImpl implements UserService {
    private final Map<Integer, User> users = new HashMap<>();

    public UserServiceImpl() {
        this.users.put(1, new User("lucy", "woman", 25));
        this.users.put(2, new User("jerry", "man", 21));
        this.users.put(3, new User("jack", "man", 16));
    }

    @Override
    public Mono<User> getUserByID(int id) {
        return Mono.justOrEmpty(this.users.get(id));
    }

    @Override
    public Flux<User> getAllUser() {
        return Flux.fromIterable(this.users.values());
    }

    @Override
    public Mono<Void> saveUserInfo(Mono<User> userMono) {
        return userMono.doOnNext(person -> {
            // 向map集合中添加值
            int id = users.size() + 1;
            users.put(id, person);
        }).then(Mono.empty());
    }

}
