package com.suollon.coding.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hzwwl
 * @date 2019/7/3 11:01
 */
@RestController
public class TestAopController {

    @Autowired
    Person person;

    @Autowired
    Test test;

    /**
     * around-----之前
     * before-----欢迎来到武汉极地海洋世界！！
     * Hello kikixi, 你多大了呀？
     * around-----之后
     * after-----欢迎再次再来玩呦~
     * afterReturning------------
     * ======================================
     * before-----即将调用TEST方法
     * 调用Test.test()
     */
    @GetMapping
    @RequestMapping("/aop/test")
    public void getArr () {
        person.sayHello("kikixi");
        System.out.println("======================================");
        test.test();
    }
    //DefaultAopProxyFactory 中描述了以下逻辑，决定使用哪种代理方式；

    //1.1，不设置的情况下，spring.aop.proxy-target-class默认为true，优先使用cglib代理；
    //     在这里的代码里，person和test都使用了cglib代理
    //1.2，设置spring.aop.proxy-target-class为false的情况下，优先使用jdk代理；
    //     在这里的代码里，person使用了jdk代理，test使用了cglib；

    //2.1，在AopProxy的子类JdkDynamicAopProxy的getProxy(..)方法中最终调用了Proxy.newProxyInstance(..)方法生成代理类；
    //2.2，在AopProxy的子类CglibAopProxy的getProxy(..)方法中最终调用了enhancer.create(..)方法生成代理类；

}
