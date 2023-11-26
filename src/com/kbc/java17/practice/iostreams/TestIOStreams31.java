package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Path;

//The current working directory is C:\Work\java_practice\java17_practice_1
public class TestIOStreams31 {
    public static void main(String... unused) throws IOException {
        Path path1 = Path.of("C:/Reading/Java/./Java17");
        Path path2 = Path.of("C:/Reading/AWS/../..");
        System.out.println(path1.toRealPath());
        System.out.println(path2.toRealPath());
    }
}
