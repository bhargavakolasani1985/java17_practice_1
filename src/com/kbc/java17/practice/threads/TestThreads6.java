package com.kbc.java17.practice.threads;

import java.io.IOException;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestThreads6 {
    public static void main(String... unused) throws IOException {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, String> map = ohMy.collect(
                Collectors.toConcurrentMap(String::length,
                        k -> k,
                        (s1, s2) -> s1 + "," + s2)
        );
        System.out.println(map); // {5=lions,bears, 6=tigers}
        System.out.println(map.getClass());
    }

}
