package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestIOStreams3 {
    public static void main(String... unused) throws IOException {
        var p1 = Path.of("/zoo/./bear","../food.txt");
        System.out.println(p1.normalize());
    }
}
