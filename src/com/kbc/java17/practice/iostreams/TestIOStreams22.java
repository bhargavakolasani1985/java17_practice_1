package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestIOStreams22 {
    public static void main(String... unused) throws IOException {
        var x = Path.of("C:/tmp/animals/fluffy/..");
        System.out.println(x);
        System.out.println(x.toRealPath());
        System.out.println(x.toRealPath().getParent());
        Files.walk(x.toRealPath().getParent())
                .forEach(System.out::println);

    }

}
