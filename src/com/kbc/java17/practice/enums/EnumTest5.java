package com.kbc.java17.practice.enums;

public class EnumTest5 {
    enum Seasons {
        WINTER(10), SPRING(10), SUMMER(10), FALL(10);
        Seasons(int a){

        }
    }
    public static void main(String[] args) {
        Seasons v = Seasons.FALL;
        switch (v) {
            case SPRING -> System.out.print("s");
            case WINTER -> System.out.print("w");
            case SUMMER -> System.out.print("m");
            default -> System.out.println("missing data"); }
    }
}
