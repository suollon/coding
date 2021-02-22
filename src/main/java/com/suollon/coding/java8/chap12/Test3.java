package com.suollon.coding.java8.chap12;

import java.time.*;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author hzwwl
 * @date 2019/7/23 17:55
 */
public class Test3 {

    public static void main(String[] args) {
        ZoneId zoneId = TimeZone.getDefault().toZoneId();
        System.out.println(ZoneId.systemDefault());
        System.out.println(TimeZone.getDefault().getID());
        System.out.println(zoneId);
        System.out.println("=================================");

        ZoneId rome = ZoneId.of("Europe/Rome");
        System.out.println(rome);
        ZonedDateTime zonedDateTime = LocalDate.now().atStartOfDay(rome);
        System.out.println(LocalDate.now().atStartOfDay());
        System.out.println(zonedDateTime);
        System.out.println("=================================");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(dateTime.atZone(rome));
        System.out.println(Instant.now());
        System.out.println(Instant.now().atZone(rome));
        System.out.println("=================================");

        ZonedDateTime zonedDateTime1 = LocalDateTime.now().atZone(ZoneId.systemDefault());
        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println("=================================");
        //LocalDateTime与Instant转换；
        System.out.println(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));

        MonthDay monthDay = MonthDay.of(3, 4);
        System.out.println(monthDay);
        MonthDay from = MonthDay.from(dateTime);
        System.out.println(from);
        System.out.println(Clock.systemDefaultZone());
        System.out.println(Clock.systemUTC());
        System.out.println("=================================");

        System.out.println(LocalDate.now().isAfter(LocalDate.of(2019, 07, 25)));
        Period period = Period.between(LocalDate.of(2018, 7, 25), dateTime.toLocalDate());
        System.out.println(dateTime.toLocalDate());
        System.out.println(LocalDate.of(2018, 07, 25));
        System.out.println(period.getDays() + "  " +  period.getMonths() + "  " +  period.getYears());
        System.out.println("=================================");

        Date date = Date.from(Instant.now());
        System.out.println(date + "   " + Instant.now());
        Instant instant = new Date().toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime);


    }

}
