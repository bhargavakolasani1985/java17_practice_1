package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Path;

public class TestIOStreams11 {
    public static void main(String... unused) throws IOException {
        Path path1 = Path.of("practice");
        Path path2 = Path.of("Reading/Java/Java17");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
    }

}
