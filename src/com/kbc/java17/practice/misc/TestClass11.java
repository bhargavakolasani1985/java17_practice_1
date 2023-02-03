package com.kbc.java17.practice.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass11 {
    public static void main(String[] args){
        int[] intArr = {1, 2, 6, 5, 8, 1, 2, 4, 4, 2, 6, 7, 6, 7, 7, 7, 7};
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i< intArr.length; i++){
            int count =0;
            for(int j = 0; j< intArr.length; j++){
                if(intArr[i] == intArr[j]){
                    count++;
                }
            }
            if(!(count%2 == 0)){
                result.add(intArr[i]);
            }
        }
        result.stream().distinct().forEach(x -> System.out.println(x));
    }
}
