package com.kbc.java17.practice.records;

import java.time.LocalDate;

public record RecordTest6(int size, String brand, LocalDate expires) {
    public static int MAX_STORAGE = 100;
    public RecordTest6(int size, String brand, LocalDate expires) {
        this.size = size;
        this.brand = brand;
        this.expires = expires;
    }

    public void show(){
        System.out.println(this.size);
    }

    public void display(){
        System.out.println(this.size = 20);
    }

}