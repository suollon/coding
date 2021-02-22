package com.suollon.coding.mybatis.reflection;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.reflection.Reflector;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author hzwwl
 * @date 2019/8/1 10:56
 */
public class ReflectorTest {

    public static void main(String[] args) throws Exception {
        //准备数据；
        Method[] methods = Holiday.class.getDeclaredMethods();
        Reflector reflector = new Reflector(Holiday.class);

        System.out.println("===============测试 getSignature 方法===============");
        Method getSignature = Reflector.class.getDeclaredMethod("getSignature", Method.class);
        getSignature.setAccessible(true);
        for (int i = 0; i < methods.length; i++) {
            String signature = (String)getSignature.invoke(reflector, methods[i]);
            System.out.print(signature + ",  ");
        }

        System.out.println("===============测试 addUniqueMethods 方法===============");
        Map<String, Method> uniqueMethods = new HashMap<>();
        Method addUniqueMethods = Reflector.class.getDeclaredMethod("addUniqueMethods", Map.class, Method[].class);
        addUniqueMethods.setAccessible(true);
        Method[] uniqueMethodArr = (Method[])addUniqueMethods.invoke(reflector, uniqueMethods, methods);
        System.out.println(uniqueMethodArr);
        //Arrays.stream(uniqueMethodArr).forEach(System.out::println);

        System.out.println("===============测试 java8的Map的computeIfAbsent 方法===============");
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("kai", "地表最强体术忍者！");
        System.out.println(stringMap.computeIfAbsent("kai", v -> "卡卡西的好朋友！"));
        System.out.println(stringMap.computeIfAbsent("kikixi", v -> "copy忍者！"));

        System.out.println("===============测试 Method的isBridge 方法===============");
        Method getName = Holiday.class.getDeclaredMethod("getName");
        System.out.println("getName.isBridge() = " + getName.isBridge());

        System.out.println(reflector.getDefaultConstructor());
        System.out.println(StringUtils.join(reflector.getGetablePropertyNames(), ", "));
        System.out.println(Arrays.stream(reflector.getSetablePropertyNames()).collect(Collectors.joining(", ")));
    }

}
