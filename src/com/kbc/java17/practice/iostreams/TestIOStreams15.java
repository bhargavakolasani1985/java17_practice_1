package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestIOStreams15 {

    static void copyIntoFlipDirectory(Path source) throws IOException {
        var dolphinDir = Path.of("/flip");
        dolphinDir = Files.createDirectories(dolphinDir);
        var n = Paths.get("sounds.txt");
    }

    public static void main(String... unused) throws IOException {
        Files.createDirectories(Path.of("/tmp/source"));
        Files.createFile(Path.of("/tmp/source/sounds.txt"));
    }

}
