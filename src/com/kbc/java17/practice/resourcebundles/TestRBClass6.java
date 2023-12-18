package com.kbc.java17.practice.resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestRBClass6 {
    public static void main(String... unused) {
        Locale.setDefault(new Locale("fr", "FRANCE"));
        System.out.println(Locale.getDefault());
        display(ResourceBundle.getBundle("Zoo", new Locale("US")));
    }

    private static void display(ResourceBundle rb){
        rb.keySet().stream().map(k -> k+"="+rb.getString(k)).forEach(System.out::println);
    }
}
