package com.suollon.coding.designpattern.structural.proxy.cglib;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * @author hzwwl
 * @date 2019/7/24 16:46
 */
public class MyCallbackFilter implements CallbackFilter {
    @Override
    public int accept(Method method) {
        if (method.getName().equals("getName")) {
            System.out.println("有人在打听你的名字");
            return 1;
        }
        if (method.getName().equals("getAddress")) {
            System.out.println("有人在打听你的地址");
            return 2;
        }
        if (method.getName().equals("setName")) {
            System.out.println("震惊，有人想给你改名字");
            return 3;
        }
        return 0;
    }
}
