package com.suollon.coding.mybatis.reflection;

import org.apache.ibatis.reflection.property.PropertyNamer;

/**
 * @author hzwwl
 * @date 2019/8/2 11:44
 */
public class PropertyTest {

    public static void main(String[] args) {
        System.out.println("0123456789".substring(3, 4));
        System.out.println("0123456789".substring(3, 3));

        //PropertyNamer是静态类，了解静态类的概念；【防止静态类的实例化】

        //仅当属性的第二个字母小写时，才把第一个字母转换为小写；
        System.out.println(PropertyNamer.methodToProperty("getNAME"));
        System.out.println(PropertyNamer.methodToProperty("getNAme"));
        System.out.println(PropertyNamer.methodToProperty("getName"));

    }

}
