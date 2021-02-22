package com.suollon.coding.designpattern.structural.proxy.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author hzwwl
 * @date 2019/7/24 16:09
 */
public class PrintInfoMethodIntecepter implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before intercept......");
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        System.out.println("after intercept......");
        return invokeSuper;
    }
}
