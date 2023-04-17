package com.kbc.java17.practice.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest23 {
    public static void main(String[] args) {
        Stream<String> s = Stream.empty();
        var p = s.collect(Collectors.partitioningBy(
                b -> b.startsWith("c")));
        var g = s.collect(Collectors.groupingBy(
                b -> b.startsWith("c")));
        System.out.println(p + " " + g);
    }
}