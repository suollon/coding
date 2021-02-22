package com.suollon.coding.designpattern.structural.proxy;

import java.lang.reflect.Proxy;

/**
 * @author hzwwl
 * @date 2019/7/22 10:48
 */
public class Test {

    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(
                Test.class.getClassLoader(),
                new Class[]{HelloWorld.class},
                new PrintInfoInvocationHandler(new HelloWorldImpl()));
        proxy.sayHello("Kikixi");
        System.out.println("==============================================");

        HelloWorld proxy2 = (HelloWorld) Proxy.newProxyInstance(
                Test.class.getClassLoader(),
                new Class[]{HelloWorld.class},
                new PlusWelcomeInvocationHandler(new HelloWorldImpl()));
        proxy2.sayHello("Kikixi");
        System.out.println("==============================================");

        User user1 = (User) Proxy.newProxyInstance(
                Test.class.getClassLoader(),
                new Class[]{User.class},
                new PrintInfoInvocationHandler(new UserImpl()));
        user1.setName("kai");
        System.out.println(user1.getName());
        System.out.println("==============================================");

        User user2 = (User) Proxy.newProxyInstance(
                Test.class.getClassLoader(),
                new Class[]{User.class},
                new PlusWelcomeInvocationHandler(new UserImpl()));
        user2.setName("kai");
        System.out.println(user2.getName());
        System.out.println("==============================================");

        User user3 = (User) createPlusWelcomeProxy(new UserImpl());
        user3.setName("kai");
        System.out.println(user2.getName());

        //动态代理只能代理接口中的方法，不能代理实现类中的自有方法；
        //UserImpl user4 = (UserImpl) createPlusWelcomeProxy(new UserImpl());
        //user4.getAddress("kai");
    }

    private static Object createPlusWelcomeProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new PlusWelcomeInvocationHandler(target));
    }

}
