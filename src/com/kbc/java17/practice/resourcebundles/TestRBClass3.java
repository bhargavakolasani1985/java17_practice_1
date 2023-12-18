package com.kbc.java17.practice.resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestRBClass3 {
    public static void main(String... unused) {
        Locale.setDefault(Locale.US);
        display(ResourceBundle.getBundle("Zoo", Locale.FRANCE));
    }

    private static void display(ResourceBundle rb){
        rb.keySet().stream().map(k -> k+"="+rb.getString(k)).forEach(System.out::println);
    }
}
