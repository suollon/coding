package com.suollon.coding.designpattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author hzwwl
 * @date 2019/7/24 14:10
 */
public class PlusWelcomeInvocationHandler implements InvocationHandler{

    private Object target;

    public PlusWelcomeInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (args != null && args.length > 0) {
            args[0] = args[0] + " ! Welcome to Java's world !";
        }
        return method.invoke(target, args);
    }
}
