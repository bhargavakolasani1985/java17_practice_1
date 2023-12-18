package com.kbc.java17.practice.resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestRBClass8 {
    public static void main(String... unused) {
        Locale.setDefault(Locale.US);
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", new Locale("es"));
        System.out.println(rb.getString("country"));
        System.out.println(rb.getString("state"));
        System.out.println(rb.getString("city"));
    }
}
