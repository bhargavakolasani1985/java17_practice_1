package com.kbc.java17.practice.records;
import java.time.LocalDate;

public record RecordTest5(int size, String brand, LocalDate expires) {
    public static int MAX_STORAGE = 100;
    public RecordTest5(int size, String brand, LocalDate expires) {
        this.size = size;
        this.brand = brand;
        this.expires = expires;
    }

    public void testIt(){ }

}