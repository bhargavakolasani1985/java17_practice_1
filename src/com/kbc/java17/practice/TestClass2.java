package com.kbc.java17.practice;

public class TestClass2 {

    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        long res = getFactorial(a);
        System.out.println(res);

    }

    private static long getFactorial(int n) {
        long res = 1;
        for(int i=1; i<=n; i++){
            res = res*i;
        }
        return res;
    }

}
