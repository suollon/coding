package com.suollon.coding.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author hzwwl
 * @date 2019/7/29 18:57
 */
@Component
@Aspect
public class MyAspect {

    //@Pointcut("execution(* *.sayHello(..))")
    //第一个*代表有返回值，第二个*代表类的全路径，..代表任意参数列表

    // execution(* com.suollon.kikixi.Study.learn(..)) && within(com.*)
    // execution(* com.suollon.kikixi.Study.learn(..)) and !bean('bean_id')

    @Pointcut("execution(* *.sayHello(..))")
    public void sayHello() {}

    @Pointcut("execution(* *.test(..))")
    public void test() {}

    @Before("sayHello()")
    public void before(JoinPoint joinPoint) {
        System.out.println((String)joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
        System.out.println("before-----欢迎来到武汉极地海洋世界！！");
    }

    @After("sayHello()")
    public void after() {
        System.out.println("after-----欢迎再次再来玩呦~");
    }

    /**
     * 环绕通知中，必须有参数——ProceedingJoinPoint point
     * 如果不调用 ProceedingJoinPoint.proceed() 方法的话，目标方法会被一直阻塞，得不到执行。
     * 类比过滤器；
     * @param point
     * @return
     */
    @Around("sayHello()")
    public Object around(ProceedingJoinPoint point) {
        System.out.println("around-----之前");
        Object o = null;
        try {
            o = point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around-----之后");
        return o;
    }

    @AfterReturning("sayHello()")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("afterReturning------------");
    }

    @AfterThrowing("sayHello()")
    public void afterThrowing() {
        System.out.println("afterThrowing------------");
    }

    @Before("test()")
    public void beforeTest() {
        System.out.println("before-----即将调用TEST方法");
    }

}
