package com.suollon.coding.java8.chap12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

/**
 * @author hzwwl
 * @date 2019/7/23 15:31
 */
public class Test2 {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2019, 07, 23);
        LocalDate date2 = date1.withYear(2018);
        LocalDate date3 = date2.withMonth(01);
        LocalDate date4 = date3.withDayOfMonth(17);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date1.with(ChronoField.DAY_OF_MONTH, 03));
        System.out.println("===================================");

        System.out.println(date1.plusWeeks(3));
        System.out.println(date1.minusYears(1));
        System.out.println(date1.plus(6, ChronoUnit.MONTHS));
        System.out.println("===================================");

        System.out.println(date1.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)));
        System.out.println(date1.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(date1.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)));
        System.out.println(date1.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.SUNDAY)));//date1这个月第一个星期天
        System.out.println(date1.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY)));//date1这个月第二个星期天
        System.out.println("===================================");

        System.out.println(date1.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(LocalDate.parse("19800228", DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(LocalDate.parse("2019-07-23", DateTimeFormatter.ISO_LOCAL_DATE));
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy//MM//dd");
        System.out.println(date1.format(formatter1));
        System.out.println("===================================");

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);
        System.out.println(date1.format(formatter2));
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.CHINA);
        System.out.println(date1.format(formatter3));
        DateTimeFormatter formatter4 = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH).appendLiteral(".. ")
                .appendText(ChronoField.MONTH_OF_YEAR).appendLiteral("==")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive()
                .toFormatter(Locale.ITALIAN);
        System.out.println(date1.format(formatter4));//这跟Locale.ITALIAN有什么关系？

    }
}
