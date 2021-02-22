package com.suollon.coding.jdk.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hzwwl
 * @date 2019/7/22 19:53
 */
public class TTest {

    /**
     * 通过反射，越过泛型检查
     *
     * 泛型是在编译期间起作用的。在编译后的.class文件中是没有泛型的。所有比如T或者E类型啊，本质都是通过Object处理的。
     *
     * 编译时是调用检查你的源程序是否有语法错误，如果没有就将其翻译成字节码文件。即.class文件。
     * 运行时是java虚拟机解释执行字节码文件。即泛型就是那些语法错误的规则。
     */
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        //编译后，没有泛型——List list = new ArrayList();
        list.add("aa");
        list.add("bb");

        Method add = list.getClass().getMethod("add", Object.class);
        add.invoke(list, 100);
        //报错；
        //list.stream().forEach(System.out::println);
        //for (String o : list) {
        //    System.out.println(o);
        //}
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
