package com.suollon.coding.java8.chap12;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author hzwwl
 * @date 2019/7/19 9:27
 */
public class Test1 {

    public static void main(String[] args) throws NoSuchFieldException {
        LocalDate localDate = LocalDate.of(2019, 07, 15);
        System.out.println(localDate + "   " + localDate.getYear() + "   " + localDate.getMonthValue() + "   " + localDate.getDayOfMonth());
        System.out.println(localDate.lengthOfMonth() + "   " + localDate.lengthOfYear() + "   " + localDate.isLeapYear());

        LocalDate today = LocalDate.now();
        System.out.println(today.get(ChronoField.YEAR));
        System.out.println(today.get(ChronoField.YEAR_OF_ERA));

        LocalTime localTime = LocalTime.of(16, 50, 55);
        System.out.println(localTime);

        LocalDate localDate1 = LocalDate.parse("2019-07-18");
        LocalTime localTime1 = LocalTime.parse("16:45:45");
        System.out.println(localDate1 + "   " + localTime1);

        LocalDateTime dt1 = LocalDateTime.of(2019, 07, 18, 16, 17, 30);
        LocalDateTime dt2 = LocalDateTime.of(localDate, localTime);
        LocalDateTime dt3 = localDate.atTime(localTime);
        LocalDateTime dt4 = localDate.atTime(17, 18, 52);
        LocalDateTime dt5 = localTime.atDate(localDate);
        System.out.println(dt1 + "   " + dt2);
        System.out.println(dt3 + "   " + dt4 + "   " + dt5);

        LocalDate localDate2 = dt1.toLocalDate();
        LocalTime localTime2 = dt1.toLocalTime();

        Instant in1 = Instant.ofEpochSecond(4);
        Instant in2 = Instant.ofEpochSecond(4, 0);
        Instant in3 = Instant.ofEpochSecond(4, 1_000_000_000);
        Instant in4 = Instant.ofEpochSecond(4, -1_000_000_000);
        System.out.println(in1);

        System.out.println("=========================================");
        //编译不报错，运行会报错，不支持两个LocalDate对象；
        //Duration d1 = Duration.between(localDate, localDate1);
        Duration d2 = Duration.between(dt1, dt2);
        System.out.println(d2);

        //仅支持LocalDate类型参数，不支持其他类型，需要转换为LocalDate才可以使用；
        Period p1 = Period.between(localDate, localDate1);
        Period p2 = Period.between(dt1.toLocalDate(), dt2.toLocalDate());
        System.out.println(p1 + "   " + p1.getDays());
        System.out.println(p2 + "   " + p2.getDays());

        Duration threeMinutes = Duration.ofMinutes(3);
        Duration threeMinute = Duration.of(3, ChronoUnit.MINUTES);
        System.out.println(threeMinutes);

        Period tenDays = Period.ofDays(10);
        Period threeWeeks = Period.ofWeeks(3);
        Period period = Period.of(2, 6, 1);
        System.out.println(String.format("%s   %s   %s", tenDays, threeWeeks, period));
    }

}
