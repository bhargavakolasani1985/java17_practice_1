package com.kbc.java17.practice.resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestRBClass1 {
    public static void main(String... unused) {
        Locale l1 = new Locale("en", "US");
        Locale l2 = new Locale("fr");
        display(ResourceBundle.getBundle("Zoo", l1));
        display(ResourceBundle.getBundle("Zoo", l2));
    }

    private static void display(ResourceBundle rb){
        System.out.println(rb.getString("message")+"---"+rb.getString("name"));
    }
}
