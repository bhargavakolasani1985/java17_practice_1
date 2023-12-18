package com.kbc.java17.practice.locales;

import java.util.Locale;

public class TestLocaleClass4 {
    public static void main(String... unused) {
        Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US").build();
        System.out.println(l1);
        Locale l2 = new Locale.Builder().setLanguage("fr").build();
        System.out.println(l2);
        Locale l3 = new Locale.Builder().setRegion("US").build();
        System.out.println(l3);
    }
}
