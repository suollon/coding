package com.suollon.coding.spring.applicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 通过实现ApplicationContextAware接口，注入applicationContext；
 * @author hzwwl
 * @date 2019/7/30 16:22
 */
@Component
public class ApplicationContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextUtil.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static Object getBean(Class clz) {
        return applicationContext.getBean(clz);
    }

    public static Object getBean(String name) {
        return applicationContext.getBean(name);
    }
}
