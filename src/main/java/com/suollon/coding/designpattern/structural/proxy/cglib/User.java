package com.suollon.coding.designpattern.structural.proxy.cglib;

/**
 * @author hzwwl
 * @date 2019/7/24 14:34
 */
public class User{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress(String name) {
        return name + " 来自火影村！";
    }
}
