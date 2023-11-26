package com.kbc.java17.practice.iostreams;

import java.io.*;

public class TestIOStreams42 {
    public static void main(String... unused) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Work\\java_practice\\source\\Test_File_1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Work\\java_practice\\target\\Test_File_1.txt"));
        bos.write(bis.readAllBytes());
        bos.close();
    }
}