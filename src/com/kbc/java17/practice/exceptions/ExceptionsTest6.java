package com.kbc.java17.practice.exceptions;

public class ExceptionsTest6 {

    public static void main(String[] args) throws Exception {
        TestCloseable tc = new TestCloseable();
            try(tc){
                System.out.println("Main::close");
                throw new Exception("Exception in main()");
            }
            catch(Exception exp){
                System.out.println(exp.getMessage());
            }
            finally{
                System.out.println("Main::finally");
            }
        System.out.println("Main::End");
    }
}
