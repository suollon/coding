package com.suollon.coding.jdk.string;

/**
 * @author hzwwl
 * @date 2019/8/23 10:09
 */
public class Test {

    public static void main(String[] args) {
        String s1 = "java";
        String s2 = new String("java");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode() + "-----" + s2.hashCode());
        System.out.println(System.identityHashCode(s1) + "-----" + System.identityHashCode(s2));

        String s3 = "hello word";
        String s4 = "hello word";
        System.out.println(s3 == s4);
    }
}
