package com.kbc.java17.practice.exceptions;

public class ExceptionsTest3 {

    public static void main(String[] args) throws Exception {
            try(MyCloseable mc = new MyCloseable();){
                System.out.println("Main::close");
                throw new Exception("Exception in main()");
            }
            finally{
                System.out.println("Main::finally");
            }
    }
}
