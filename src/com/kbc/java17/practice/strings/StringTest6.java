package com.kbc.java17.practice.strings;

import java.util.TreeMap;

public class StringTest6 {

    public static void main(String args[]){
        String str = "Bhargava is a Java DeveloperB";
        TreeMap<String, Integer> tm = new TreeMap<>();
        outer: for(int i = 0; i<str.length(); i++){
            inner: for(int j = 0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    tm.put(String.valueOf(str.charAt(i)), j);
                    break inner;
                }
            }
        }
        System.out.println(tm);
    }
}
