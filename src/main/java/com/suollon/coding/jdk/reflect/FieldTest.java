package com.suollon.coding.jdk.reflect;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author hzwwl
 * @date 2019/7/22 16:21
 */
public class FieldTest {

    public static void main(String[] args) throws Exception {
        Class clz = Class.forName("com.example.demo.jdk.reflect.Student");

        System.out.println("*************************所有公有字段*************************");
        Field[] fields = clz.getFields();
        Arrays.stream(fields).forEach(System.out::println);
        System.out.println("*************************所有字段*************************");
        Field[] declaredFields = clz.getDeclaredFields();
        Arrays.stream(declaredFields).forEach(System.out::println);
        System.out.println("*************************获取指定字段*************************");
        System.out.println(clz.getField("mobile"));
        System.out.println(clz.getDeclaredField("sex"));
        System.out.println(clz.getDeclaredField("name"));
        System.out.println(clz.getDeclaredField("age"));
        System.out.println(clz.getDeclaredField("address"));
        System.out.println("*************************使用private字段*************************");
        Student st1 = (Student)clz.getDeclaredConstructor().newInstance();
        System.out.println(st1);
        Field name = clz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(st1, "kikixi");
        System.out.println(st1);
        System.out.println("*************************使用默认权限字段*************************");
        Field sex = clz.getDeclaredField("sex");
        sex.set(st1, 'a');
        System.out.println(st1);
        System.out.println("*************************使用protected字段*************************");
        Field age = clz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(st1, 19);
        System.out.println(st1);
        System.out.println("*************************使用public字段*************************");
        Field mobile = clz.getField("mobile");
        mobile.set(st1, "45318574");
        System.out.println(st1);
        System.out.println("*************************使用public + static 字段*************************");
        Field address = clz.getDeclaredField("address");
        address.set(st1, "火影村");
        System.out.println(st1);
    }

}
