package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Path;

public class TestIOStreams3 {
    public static void main(String... unused) throws IOException {
        System.out.println(Path.of("C:/zoo/../home").getParent());
        System.out.println(Path.of("C:/zoo/../home").getParent().normalize());
        System.out.println(Path.of("C:/zoo/../home").normalize().getParent());
        System.out.println(Path.of("C:/zoo/../home").getParent().normalize().toAbsolutePath());
    }
}
