package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestIOStreams9 {
    public static void main(String... unused) throws IOException {
        var x = Path.of("C:/tmp/animals/fluffy/..");
        Files.walk(x.toRealPath().getParent())
                .map(p -> p.toAbsolutePath().toString())
                .filter(s -> s.endsWith(".txt"))
                .forEach(System.out::println);

    }

}
