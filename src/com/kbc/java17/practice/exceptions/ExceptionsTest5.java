package com.kbc.java17.practice.exceptions;

public class ExceptionsTest5 {

    public static void main(String[] args) throws Exception {
            try(MyCloseable mc = new MyCloseable();){
                System.out.println("Main::close");
                throw new Exception("Exception in main()");
            }
            catch(Exception exp){
                System.out.println(exp.getMessage());
            }
            finally{
                System.out.println("Main::finally");
            }
    }
}
