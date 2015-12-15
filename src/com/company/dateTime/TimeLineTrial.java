package com.company.dateTime;

import com.company.lambdas.InCaps;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TimeLineTrial {
    public static void main(String[] args) {
//        Instant start = Instant.now();
//        InCaps caps=(String a)->a.toUpperCase();
//        Instant end = Instant.now();
//        System.out.println(caps.incaps("something"));
//        Duration timeElapsed = Duration.between(start, end);
//        long millis = timeElapsed.toMillis();
//        System.out.println(millis);
//
//        System.out.println(end.plusMillis(789));
//
//        Duration timeElapsed2 = Duration.between(start, end);
//        System.out.println("timeElapsed2 "+timeElapsed2.toMillis());
//        System.out.println("timeElapsed.multipliedBy(10) "+timeElapsed.multipliedBy(10).toMillis());
//        System.out.println("minus(timeElapsed2) "+timeElapsed.multipliedBy(10).minus(timeElapsed2).toMillis());
//        boolean overTenTimesFaster =
//                timeElapsed.multipliedBy(10).minus(timeElapsed2).isNegative();
//        System.out.println("overTenTimesFaster   "+overTenTimesFaster);
//
//        LocalDate today = LocalDate.now(); // Today’s date
//        LocalDate alonzosBirthday = LocalDate.of(1903, 6, 14);
//        System.out.println(alonzosBirthday);
//        alonzosBirthday = LocalDate.of(1903, Month.JUNE, 14);
//        System.out.println(alonzosBirthday);

        LocalDate programmersDay = LocalDate.of(2014, 1, 1);
        System.out.println(programmersDay.plusDays(255));
        System.out.println(programmersDay.plusWeeks(25));
        System.out.println(programmersDay.until(programmersDay.plusWeeks(25)));
        System.out.println(programmersDay.until(programmersDay.plusWeeks(25)).getMonths());
        System.out.println(programmersDay.until(programmersDay.plusWeeks(25), ChronoUnit.DAYS));
        System.out.println(ChronoUnit.DAYS.toString());

        TemporalAdjuster NEXT_WORKDAY = w -> {
            LocalDate result = (LocalDate) w;
            do {
                result = result.plusDays(1);
            } while (result.getDayOfWeek().getValue() >= 6);
            return result;
        };
        LocalDate today=LocalDate.now().plusDays(2);
        LocalDate backToWork = today.with(NEXT_WORKDAY);

        System.out.println("backToWork "+backToWork);


        NEXT_WORKDAY = TemporalAdjusters.ofDateAdjuster(w -> {
            LocalDate result = w; // No cast
            do {
                result = result.plusDays(1);
            } while (result.getDayOfWeek().getValue() >= 6);
            return result;
        });
    }
}
