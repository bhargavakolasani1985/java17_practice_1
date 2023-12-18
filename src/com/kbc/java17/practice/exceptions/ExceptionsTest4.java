package com.kbc.java17.practice.exceptions;

public class ExceptionsTest4 {

    public static void main(String[] args) throws Exception {
            try(MyCloseable mc = new MyCloseable();){
                System.out.println("Main::close");
                throw new Exception("Exception in main()");
            }
            catch(Exception exp){
                System.out.println("Main::catch");
            }
            finally{
                System.out.println("Main::finally");
            }
        System.out.println("Main::End");
    }
}
