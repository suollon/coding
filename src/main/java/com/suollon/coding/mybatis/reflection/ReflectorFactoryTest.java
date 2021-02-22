package com.suollon.coding.mybatis.reflection;

import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.Reflector;
import org.apache.ibatis.reflection.ReflectorFactory;

/**
 * @author hzwwl
 * @date 2019/8/1 17:02
 */
public class ReflectorFactoryTest {

    public static void main(String[] args) {
        //1,通过factory获取
        ReflectorFactory factory = new DefaultReflectorFactory();
        Reflector holidayReflector = factory.findForClass(Holiday.class);
        //2,通过Reflector获取
        Reflector holiday = new Reflector(Holiday.class);

        //通过1,2获取反射对象的主要区别是：factory使用【享元模式】+【工厂模式】缓存了反射对象；而Reflector没有；
        System.out.println(holidayReflector.getType().equals(holiday.getType()));
    }

}
