package com.suollon.coding.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 在日志中打印所有的 url，请求参数和返回值
 * @author hzwwl
 * @date 2019/9/5 14:41
 */
@Aspect
@Component
public class ControllerLogAop {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerLogAop.class);

    @Pointcut("execution(* com.example.demo.controller.*(..))")
    public void controller(){}

    @Around("controller()")
    public Object around(ProceedingJoinPoint point) {
        Object result = null;
        try {
            ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            LOGGER.info("url----->{}", requestAttributes.getRequest().getRequestURL().toString());
            LOGGER.info("参数列表----->{}", point.getArgs());
            result = point.proceed();
            LOGGER.info("返回值----->{}", result);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }
}
