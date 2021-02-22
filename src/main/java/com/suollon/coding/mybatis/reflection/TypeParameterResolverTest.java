package com.suollon.coding.mybatis.reflection;

import org.apache.ibatis.reflection.TypeParameterResolver;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * @author hzwwl
 * @date 2019/8/1 19:32
 */
public class TypeParameterResolverTest {

    ZClassSub<Long> zsub = new ZClassSub<>();

    public static void main(String[] args) throws Exception {
        Field field = ZClass.class.getDeclaredField("map");
        System.out.println(field.getGenericType());
        System.out.println(field.getGenericType() instanceof ParameterizedType);

        Type type = TypeParameterResolver.resolveFieldType(field, ParameterizedTypeImpl.make(ZClassSub.class, new Type[]{Long.class}, TypeParameterResolverTest.class.getClass()));
        System.out.println(type.getClass());

        ParameterizedType p = (ParameterizedType) type;
        System.out.println(p.getRawType());
        System.out.println(p.getOwnerType());
        Arrays.stream(p.getActualTypeArguments()).forEach(System.out::println);
    }

}
