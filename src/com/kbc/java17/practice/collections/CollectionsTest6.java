package com.kbc.java17.practice.collections;

import java.util.ArrayDeque;
import java.util.HashMap;

public class CollectionsTest6 {
    public static void main(String[] args){
        var greetings = new ArrayDeque<String>();
          greetings.offerLast("hello");
          greetings.offerLast("hi");
          greetings.offerFirst("ola");
          greetings.pop();
          greetings.peek();
          while (greetings.peek() != null)
                System.out.print(greetings.pop());
    }
}
