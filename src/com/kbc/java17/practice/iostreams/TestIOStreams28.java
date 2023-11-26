package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Path;

public class TestIOStreams28 {
    public static void main(String... unused) throws IOException {
        Path path1 = Path.of("/pony/../weather.txt");
        Path path2 = Path.of("/weather.txt");
        System.out.println(path1.equals(path2));
        System.out.println(path1.normalize().equals(path2));
        Path path3 = Path.of("/weather.txt");
        Path path4 = Path.of("/weather.txt");
        System.out.println(path3.equals(path4));
    }
}
