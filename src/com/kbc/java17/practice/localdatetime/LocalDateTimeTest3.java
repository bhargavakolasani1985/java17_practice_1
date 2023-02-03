package com.kbc.java17.practice.localdatetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest3 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        var date = LocalDate.now();
        var time = LocalTime.now();
        var dateTime = LocalDateTime.now();
        var zoneId = ZoneId.systemDefault();
        var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
        //Instant instant2 = new Instant(10, 100);
        System.out.println(dateTime.toInstant(ZoneOffset.ofTotalSeconds(0)));
        System.out.println(zonedDateTime.toInstant());
    }
}