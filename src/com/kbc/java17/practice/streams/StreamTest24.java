package com.kbc.java17.practice.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest24 {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.empty();
        Stream<String> s2 = Stream.empty();
        var p = s1.collect(Collectors.partitioningBy(
                b -> b.startsWith("c")));
        var g = s2.collect(Collectors.groupingBy(
                b -> b.startsWith("c")));
        System.out.println(p + " " + g);
    }
}