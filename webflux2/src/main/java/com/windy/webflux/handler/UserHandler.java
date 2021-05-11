package com.windy.webflux.handler;

import com.windy.webflux.entity.User;
import com.windy.webflux.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author windyStreet
 * @codetime 2021-05-10 18:23
 */
public class UserHandler {

    private final UserService userService;

    public UserHandler(UserService userService) {
        this.userService = userService;
    }

    // 根据id查询
    public Mono<ServerResponse> getUserById(ServerRequest request) {
        // 获取id值
        Integer userId = Integer.valueOf(request.pathVariable("id"));
        // 空值处理
        Mono<ServerResponse> notFound = ServerResponse.notFound().build();
        // 调用service 方法得到数据
        Mono<User> userMono = this.userService.getUserByID(userId);
        // 把userMono进行转换返回
        // 使用Reactor 操作符 flatMap
        return userMono.flatMap(person -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(person)).switchIfEmpty(notFound);
//        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(userMono, User.class).switchIfEmpty(notFound);
    }

    // 查询所有

    public Mono<ServerResponse> getAllUsers(ServerRequest request) {
        // 调用service 获得结果
        Flux<User> users = this.userService.getAllUser();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(users, User.class);
    }

    // 添加
    public Mono<ServerResponse> saveUser(ServerRequest request){
        Mono<User> userMono = request.bodyToMono(User.class);
        return ServerResponse.ok().build(this.userService.saveUserInfo(userMono));
    }
}
