package com.suollon.coding.mybatis.reflection;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;

import java.util.Arrays;

/**
 * @author hzwwl
 * @date 2019/8/1 20:49
 */
public class ObjectFactoryTest {

    public static void main(String[] args) {
        ObjectFactory factory = new DefaultObjectFactory();
        Holiday holiday = factory.create(Holiday.class);
        System.out.println(holiday);

        //User没有无参构造器，用下面的方法反射创建user实例会报错；
        //User user1 = factory.create(User.class);
        User user = factory.create(User.class, Arrays.asList(new Class[]{String.class, int.class}), Arrays.asList(new Object[]{"kikixi", 19}));
        System.out.println(user);

    }

}
