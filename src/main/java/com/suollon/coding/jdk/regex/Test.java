package com.suollon.coding.jdk.regex;

import java.util.regex.Pattern;

/**
 * @author hzwwl
 * @date 2019/8/13 15:27
 */
public class Test {

    static String content01 = "The fat cat sat on the mat.";
    static String content02 = "The car parked in the garage.";
    static String content03 = "A garage is a good place to park a car.";
    static String content04 = "A garage is a good place to park a car.";

    static Pattern pattern01 = Pattern.compile("the");
    static Pattern pattern02 = Pattern.compile(".ar");
    static Pattern pattern03 = Pattern.compile("[Tt]he");
    static Pattern pattern04 = Pattern.compile("ar[.]");
    static Pattern pattern05 = Pattern.compile("[a-z]*");




    public static void main(String[] args) {
        System.out.println(pattern01.matcher(content01).find());
        System.out.println(pattern02.matcher(content02).find());
        System.out.println(pattern03.matcher(content02).find());
        System.out.println(pattern04.matcher(content03).find());

        System.out.println(2 | 2);
    }

}
