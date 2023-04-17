package com.kbc.java17.practice.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest25 {
    public static void main(String[] args) {
        List.of(10, 20, 30, 40, 50).stream().peek(e -> System.out.println(e)).noneMatch(e -> e == 30);

    }
}