package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TestIOStreams2 {
    public static void main(String... unused) throws IOException {
        System.out.println(Path.of("/zoo/../home").getParent());
        System.out.println(Path.of("/zoo/../home").getParent().normalize());
        System.out.println(Path.of("/zoo/../home").normalize().getParent());
        System.out.println(Path.of("/zoo/../home").getParent().normalize().toAbsolutePath());
    }

}
