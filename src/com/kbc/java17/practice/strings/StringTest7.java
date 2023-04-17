package com.kbc.java17.practice.strings;
public class StringTest7 {

    public static void main(String args[]){
        String str1 = "ab";
        str1 += "c";
        System.out.println(str1 == "abc");
        String str2 = "abc";
        System.out.println(str2 == "abc");
    }
}
