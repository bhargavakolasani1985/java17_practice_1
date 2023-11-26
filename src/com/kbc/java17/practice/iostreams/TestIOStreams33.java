package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestIOStreams33 {
    public static void main(String... unused) throws IOException {
        Files.copy(
                Path.of("C:\\Work\\java_practice\\source\\TestCalss1.java"),
                Path.of("C:\\Work\\java_practice\\target\\TestCalss1.java")
        );
    }
}
