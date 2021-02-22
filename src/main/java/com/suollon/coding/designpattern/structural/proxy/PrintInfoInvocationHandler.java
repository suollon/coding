package com.suollon.coding.designpattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author hzwwl
 * @date 2019/7/22 10:44
 */
public class PrintInfoInvocationHandler implements InvocationHandler {

    //被代理对象
    private Object target;

    public PrintInfoInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy=====" + proxy.getClass());
        System.out.println("method=====" + method);
        System.out.print("args=====");
        if (args != null && args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i] + ", ");
            }
            System.out.println();
        }
        System.out.println("before invocation");
        Object retVal = method.invoke(target, args);
        System.out.println("after invocation");
        return retVal;
    }
}
