package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Path;

public class TestIOStreams7 {
    public static void main(String... unused) throws IOException {
        Path path1 = Path.of("C:\\Reading\\Java\\Java17");
        Path path2 = Path.of("Java18");
        Path path3 = Path.of("./practice");
        Path path4 = Path.of("/Reading/Java/Java17");
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));
        System.out.println(path2.resolve(path3));
        System.out.println(path3.resolve(path2));
        System.out.println(path3.resolve(path4));
    }

}
