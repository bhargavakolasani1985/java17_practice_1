package com.kbc.java17.practice.iostreams;

import java.io.*;

public class TestIOStreams13 {
    public static void main(String... unused) throws Exception {
        copyFile(new File("C:\\tmp\\io\\source\\file1.txt"), new File("C:\\tmp\\io\\dest\\file2.txt"));
    }

    public static void copyFile(File file1, File file2) throws Exception {
        var reader = new InputStreamReader(new FileInputStream(file1));
        try (var writer = new FileWriter(file2)) {
            char[] buffer = new char[10];
            while(reader.read(buffer) != -1) {
                writer.write(buffer);
                buffer = new char[10];
                // n1
            }
        }
    }

}
