package com.kbc.java17.practice.streams;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest29 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        System.out.println(stream.filter(x -> x.length() >0).collect(Collectors.toSet()));
        stream = Stream.empty();
        System.out.println(stream.max((x, y) -> x.compareTo(y)));
        stream = Stream.empty();
        stream.forEach(System.out::println);
    }
}