package com.kbc.java17.practice.threads;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestThreads3 {
    public static void main(String... unused) throws IOException {
        var cats = Stream.of("leopard", "lynx", "ocelot", "puma")
            .parallel();
        var bears = Stream.of("panda","grizzly","polar").parallel();
        var data = Stream.of(cats,bears).flatMap(s -> s)
            .collect(Collectors.groupingByConcurrent(
                       s -> !s.startsWith("p")));
        System.out.println(data.get(false));
        System.out.println(data.get(true));
        System.out.println(data.get(false).size()
                    + " " + data.get(true).size());

    }

}
