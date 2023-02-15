package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestIOStreams8 {
    public static void main(String... unused) throws IOException {
        var x = Path.of("C:/tmp/animals/fluffy/..");
        Files.walk(x.toRealPath().getParent())
                .forEach(System.out::println);

    }

}
