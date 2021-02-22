package com.suollon.coding.jdk.reflect;

import java.lang.reflect.Method;

/**
 * java1.4是没有可变参数的，即Method.invoke(Obeject objecr ,Object obj[]{“xx”,“yy”});用数组传递多个参数 。
 * java1.5有了可变参数，即Method.invoke(Objet objecr,Object…args);用可变参数传递多个参数。
 *
 * 由于兼容性问题，在JDK1.4没有引入可变参数Object…类型，所以使用数组来表示，invoke函数接收到String数组后会进行拆分，得到两个String变量，但是没有main函数接受 两个String值，所以不行。
 * 而且只要参数是new Object[]{“xxx”,”yyy”}，javac 为了兼容1.4，只把它当作 jdk1.4 的语法进行理解，而不把它当作 jdk1.5 的语法解释，也就是说不能传递new String[]{};。
 * 解决方法：
 * (1)、mainMethod.invoke(null,new Object[]{new String[]{“20190212”}});该方法还是会按1.4处理，会将参数打散，但没关系，里面就是对的参数new String[]{“xxx”}。
 * (2)、mainMethod.invoke(null,(Object)new String[]{“20190212”}); 不会打散，因为强转为Object了，编译器会认为这不是一个数组，此时是一个完整的参数。但注意他本质还是一个数组，作用仅仅是骗过编译器而已。
 */
public class MainMethodTest {

    public static void main(String[] args) throws Exception {
        Class clz = Class.forName("com.example.demo.jdk.reflect.Student");
        Method main = clz.getMethod("main", String[].class);
        System.out.println(main);
        //main.invoke(null, new String[]{"a", "b"});
        main.invoke(null, (Object)new String[]{"a", "b"});
        main.invoke(null, new Object[]{new String[]{"a", "b"}});
    }

}
