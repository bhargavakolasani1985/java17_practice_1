package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestIOStreams2 {

    static void copyIntoFlipDirectory(Path source) throws IOException {
        var dolphinDir = Path.of("/flip");
        dolphinDir = Files.createDirectories(dolphinDir);
        var n = Paths.get("sounds.txt");
        Files.copy(source, dolphinDir.resolve(n), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String... unused) throws IOException {
        copyIntoFlipDirectory(Path.of("/tmp/source/sounds.txt"));
    }

}
