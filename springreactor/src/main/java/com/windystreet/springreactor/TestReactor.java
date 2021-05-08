package com.windystreet.springreactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author windyStreet
 * @codetime 2021-05-08 17:30
 */

/**
 * 三种信号
 */
public class TestReactor {
    public static void main(String[] args) {
        // just方法 直接申明
//        Flux.just(1, 2, 3, 4); // 仅仅声明了一个数据流
        Flux.just(1, 2, 3, 4).subscribe(System.out::println); // 订阅了才会出现操作
        Mono.just(1);

        // 其他方法
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        Flux.fromArray(arr);
        List<Integer> list = Arrays.asList(arr);
        Flux.fromIterable(list);
        Stream<Integer> stream = list.stream();
        Flux.fromStream(stream);

//        Flux.error(new Throwable());

    }
}
