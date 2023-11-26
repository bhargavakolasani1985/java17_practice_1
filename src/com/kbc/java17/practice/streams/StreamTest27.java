package com.kbc.java17.practice.streams;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest27 {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length()< 3;
        var stream = Stream.iterate("---",
                s -> ! s.isEmpty(), (s) -> s + s);
        var b1 = stream.noneMatch(predicate);
        System.out.println(b1);
    }
}