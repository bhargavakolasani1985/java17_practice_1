package com.kbc.java17.practice.records;
import java.time.LocalDate;

public record RecordTest1 (int size, String brand, LocalDate expires) {
    public static int MAX_STORAGE = 100;
    public RecordTest1(int size, String brand, LocalDate expires) {

    }
}