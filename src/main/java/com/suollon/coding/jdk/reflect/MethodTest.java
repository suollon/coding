package com.suollon.coding.jdk.reflect;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author hzwwl
 * @date 2019/7/22 18:53
 */
public class MethodTest {

    public static void main(String[] args) throws Exception {
        Class clz = Class.forName("com.example.demo.jdk.reflect.Student");
        System.out.println("*************************所有公有方法*************************");
        Method[] methods = clz.getMethods();
        Arrays.stream(methods).forEach(System.out::println);
        System.out.println("*************************所有自己声明的方法*************************");
        Method[] declaredMethods = clz.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(System.out::println);
        System.out.println("*************************所有指定的方法*************************");
        Method show1 = clz.getMethod("show1", String.class);
        Method show2 = clz.getDeclaredMethod("show2");
        Method show3 = clz.getDeclaredMethod("show3");
        Method show4 = clz.getDeclaredMethod("show4", int.class);
        Method show5 = clz.getDeclaredMethod("show4", Integer.TYPE);
        Method show6 = clz.getDeclaredMethod("main", String[].class);
        System.out.println(show1);
        System.out.println(show2);
        System.out.println(show3);
        System.out.println(show4);
        System.out.println(show6);
        System.out.println("*************************调用方法*************************");
        Student student = (Student) clz.getDeclaredConstructor().newInstance();
        //Student student = new Student();
        show1.invoke(student, "kikixi");
        Object invoke2 = show2.invoke(student);
        Object invoke3 = show3.invoke(student);
        show4.setAccessible(true);
        Object invoke4 = show4.invoke(student, 19);
        System.out.println(invoke2 + "   " + invoke3 + "   " + invoke4);
        //main方法不能这样执行；
        //show6.invoke(student, null);
        System.out.println("*************************finish*************************");

    }

}
