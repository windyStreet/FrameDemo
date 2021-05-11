package com.windy.webflux;

import com.windy.webflux.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

/**
 * @author windyStreet
 * @codetime 2021-05-11 14:09
 */
public class Client {
    public static void main(String[] args) {

        // 调用服务器地址
        WebClient webClient = WebClient.create("http://127.0.0.1:57714");

        // 根据id查询
        String id = "1";
        User userResult = webClient.get().uri("/users/{id}", id).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(User.class).block();
        System.out.println(userResult);
        Flux<User> userResults = webClient.get().uri("/users").accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(User.class);
        userResults.map(st -> st.getName()).buffer().doOnNext(System.out::println).blockFirst();

    }
}
