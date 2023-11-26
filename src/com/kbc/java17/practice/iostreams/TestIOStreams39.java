package com.kbc.java17.practice.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestIOStreams39 {
    public static void main(String... unused) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Work\\java_practice\\source\\test_1.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Work\\java_practice\\target\\test_1.txt");
        int bytesRead;
        while((bytesRead = fis.read()) != -1){
            fos.write(bytesRead);
        }
    }
}
