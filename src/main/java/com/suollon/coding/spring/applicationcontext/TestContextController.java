package com.suollon.coding.spring.applicationcontext;

import com.suollon.coding.spring.aop.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hzwwl
 * @date 2019/7/30 15:32
 */
@RestController
public class TestContextController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping
    @RequestMapping("/context/test")
    public void test() {
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
        //AnnotationConfigServletWebServerApplicationContext
        System.out.println(applicationContext.getClass());
        System.out.println(ApplicationContextUtil.getBean(Person.class));
    }
}
