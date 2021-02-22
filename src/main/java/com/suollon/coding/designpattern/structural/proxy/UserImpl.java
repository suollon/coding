package com.suollon.coding.designpattern.structural.proxy;

import java.io.Serializable;

/**
 * @author hzwwl
 * @date 2019/7/24 14:34
 */
public class UserImpl implements User, Serializable {
    private String name;
    private int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress(String name) {
        return name + " 来自火影村！";
    }
}
