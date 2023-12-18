package com.kbc.java17.practice.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsTest2 {

    public static void main(String[] args) throws Exception {
            try(MyCloseable mc = new MyCloseable();){
                System.out.println("Main::close");
            }
        System.out.println("Main::End");

    }
}
