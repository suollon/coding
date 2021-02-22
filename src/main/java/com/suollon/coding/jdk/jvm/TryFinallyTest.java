package com.suollon.coding.jdk.jvm;

/**
 * @author hzwwl
 * @date 2019/9/2 11:19
 */
public class TryFinallyTest {

    public static void main(String[] args) {

        test1();
        System.out.println();
        System.out.println(test2());
        System.out.println();
        System.out.println(test3());
        System.out.println();
        System.out.println(test4());
    }

    public static void test1() {
        try {
            System.out.println("test1()----->try");
        } finally {
            System.out.println("test1()----->finally");
        }
    }

    public static String test2() {
        try {
            System.out.println("test2()----->try");
            return "test2()----->try";
        } finally {
            System.out.println("test2()----->finally");
            return "test2()----->finally";
        }
    }

    public static String test3() {
        String result = "test3()----->try";
        try {
            System.out.println("test3()----->try");
            return result;
        } finally {
            System.out.println("test3()----->finally");
            result = "test3()----->finally";
        }
    }

    public static String test4() {
        String result = "test4()----->try";
        try {
            System.out.println("test4()----->try");
            int i = 1/0;
            return result;
        } finally {
            System.out.println("test4()----->finally");
            result = "test4()----->finally";
        }
    }
}
