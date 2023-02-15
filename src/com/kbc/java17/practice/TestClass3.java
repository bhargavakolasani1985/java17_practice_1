package com.kbc.java17.practice;

import java.util.*;
import java.util.stream.Stream;

public class TestClass3 {

    public static void main(String[] args){

        int[] intArr = {3,4,5,6,7,7,8,9,10, 12};
        int n = 15;
        List<Integer> list = new ArrayList<>();
        Arrays.stream(intArr).forEach(x -> list.add(x));
        System.out.println(list);
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        for(int i=0; i<list.size(); i++){
             if(list.contains(n-list.get(i))){
                 if(resultMap.containsKey(n-list.get(i))){
                     continue;
                 }
                 else{
                     resultMap.put(list.get(i), n-list.get(i));
                 }
             }
        }
        System.out.println(resultMap);
    }
}
