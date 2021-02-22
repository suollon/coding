package com.suollon.coding.jdk.reflect;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 *
 * @author hzwwl
 * @date 2019/7/22 15:06
 */
public class ConstructorTest {

    public static void main(String[] args) throws Exception {
        getClassTest();
        System.out.println("=========================================");
        constructorTest();
    }

    public static void constructorTest() throws Exception {
        Class clz = Class.forName("com.example.demo.jdk.reflect.Student");

        System.out.println("*************************所有共有构造方法*************************");
        Constructor<?>[] constructors = clz.getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);
        System.out.println("*************************所有构造方法*************************");
        Constructor[] declaredConstructors = clz.getDeclaredConstructors();
        Arrays.stream(declaredConstructors).forEach(System.out::println);
        System.out.println("*************************所有无参构造方法*************************");
        //以下两种方式，只有在无参构造器被public修饰时，才可以获取到，否则报错；
        //Constructor constructor1 = clz.getConstructor(null);
        //Constructor constructor2 = clz.getConstructor();
        //System.out.println(constructor1);
        //System.out.println(constructor2);
        Constructor constructor = clz.getDeclaredConstructor(null);
        System.out.println(constructor);
        System.out.println((Student)constructor.newInstance());
        System.out.println("*************************获取指定形参的构造方法*************************");
        System.out.println(clz.getDeclaredConstructor(String.class));
        System.out.println(clz.getDeclaredConstructor(int.class));
        System.out.println(clz.getDeclaredConstructor(String.class, int.class));
        System.out.println(clz.getDeclaredConstructor(char.class));
        //不能用包装类型替换，会报错；但是可以使用包装类型的TYPE常量；
        //System.out.println(clz.getDeclaredConstructor(Boolean.class));
        System.out.println(clz.getDeclaredConstructor(Boolean.TYPE));
        System.out.println(clz.getDeclaredConstructor(boolean.class));
        System.out.println("*************************调用私有构造方法*************************");
        Constructor privateConstructor = clz.getDeclaredConstructor(int.class);
        //不开启权限，直接调用，会报错
        privateConstructor.setAccessible(true);
        Student s2 = (Student)privateConstructor.newInstance(8);
        System.out.println(s2);
        System.out.println("finish！！！");
    }

    /**
     * 1 Object ——> getClass();
     * 2 任何数据类型（包括基本数据类型）都有一个“静态”的class属性
     * 3 通过Class类的静态方法：forName（String  className）(常用)
     */
    public static void getClassTest() throws Exception {
        //一个类的class对象只有一个；三种获取方式
        System.out.println(Object.class == Class.forName("java.lang.Object"));
        System.out.println(Object.class == new Object().getClass());
        //基本类型也有 "静态" 的class属性
        System.out.println(int.class.getName());
    }

}
