package com.kbc.java17.practice.exceptions;

import java.util.Arrays;

public class ExceptionsTest8 {

    public static void main(String[] args) throws Exception {
        TestCloseable tc = new TestCloseable();
            try(tc){
                System.out.println("Main::close");
                throw new Exception("Exception in main()");
            }
            catch(Exception exp){
                System.out.println(exp.getMessage());
                Arrays.stream(exp.getSuppressed()).forEach(e -> System.out.println(e.getMessage()));
            }
            finally{
                System.out.println("Main::finally");
            }
        System.out.println("Main::End");
    }
}
