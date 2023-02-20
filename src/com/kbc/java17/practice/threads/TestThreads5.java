package com.kbc.java17.practice.threads;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestThreads5 {
    public static void main(String... unused) throws IOException {
        var cats = Stream.of("leopard", "lynx", "ocelot", "puma")
            .parallel();
        var bears = Stream.of("panda","grizzly","polar").parallel();
        var data = Stream.of(cats,bears).flatMap(s -> s)
            .collect(Collectors.groupingBy(
                       s -> s.length()));
        System.out.println(data);
        System.out.println(data.size());
    }

}
