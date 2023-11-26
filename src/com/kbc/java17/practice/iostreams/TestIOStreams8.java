package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Path;

public class TestIOStreams8 {
    public static void main(String... unused) throws IOException {
        Path path1 = Path.of("C:\\Reading\\Java\\Java17");
        Path path2 = Path.of("C:\\Reading\\AWS");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
    }
}
