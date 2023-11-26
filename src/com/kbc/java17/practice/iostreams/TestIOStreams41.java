package com.kbc.java17.practice.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIOStreams41 {
    public static void main(String... unused) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Work\\java_practice\\source\\Test_File_1.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Work\\java_practice\\target\\Test_File_1.txt");
        int bytesToRead = 1024;
        byte[] buff = new byte[bytesToRead];
        int bytesRead;
        while((bytesRead = fis.read(buff, 0, bytesToRead)) > 0){
            fos.write(buff, 0, bytesRead);
        }
    }
}