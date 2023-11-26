package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Path;
//The existing directory is C:\Reading\Java\Java17
public class TestIOStreams29 {
    public static void main(String... unused) throws IOException {
        Path path1 = Path.of("C:/Reading/Java/../Java17");
        System.out.println(path1.toRealPath());

    }
}
