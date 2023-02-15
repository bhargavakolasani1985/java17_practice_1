package com.kbc.java17.practice.streams;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class StreamTest8 {
    public static void main(String[] args) {
        var s = DoubleStream.of(1.2, 2.4);
        s.peek(System.out::println).filter(x -> x> 2).count();
    }
}