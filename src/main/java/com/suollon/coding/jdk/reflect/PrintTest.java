package com.suollon.coding.jdk.reflect;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author hzwwl
 * @date 2019/8/5 15:16
 */
public class PrintTest {

    public static void main(String[] args) throws Exception {
        Method print = StringPrint.class.getDeclaredMethod("print");
        Method printString = StringPrint.class.getDeclaredMethod("print", String.class);
        Method printObject = StringPrint.class.getDeclaredMethod("print", Object.class);

        System.out.println(print.isBridge() + "---" + printString.isBridge()  + "---" + printObject.isBridge());

        Method[] methods = StringPrint.class.getDeclaredMethods();
        Arrays.stream(methods).forEach(method -> {
            System.out.println(method.getName() + "=============");
            Arrays.stream(method.getParameterTypes()).forEach(t -> System.out.println(t.getName()));
        });
        Print ps = new StringPrint();
        ps.print("kikixi");
        //ps.print(new Object());

    }

}
