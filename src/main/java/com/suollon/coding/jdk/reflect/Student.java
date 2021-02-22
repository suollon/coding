package com.suollon.coding.jdk.reflect;

/**
 * @author hzwwl
 * @date 2019/7/22 15:24
 */
public class Student {

    private String name;
    protected int age;
    char sex;
    public String mobile;
    public static String address;

    Student(String str) {
        System.out.println("一个参数构造器 str = " + str);
    }

    Student() {
        System.out.println("无参构造器");
    }

    public Student(char sex) {
        System.out.println("public + char参数的构造区器 char = " + sex);
    }

    public Student(String name, int age) {
        System.out.println("public + 两个参数的构造器 name = " + name + ", age = " + age);
    }

    protected Student(boolean b) {
        System.out.println("protected + boolean参数的构造器 b = " + b);
    }

    private Student(int age) {
        System.out.println("私有构造器 age = " + age);
    }

    public void show1(String str) {
        System.out.println("show1 + public + 一个string参数的方法 str = " + str);
    }

    protected void show2() {
        System.out.println("show2 + protected + 无参的方法");
    }

    int show3() {
        System.out.println("show3 + 默认权限 + 无参的方法");
        return 27;
    }

    private String show4(int age) {
        System.out.println("show4 + private + 一个int参数的方法 age = " + age);
        return "固定返回字符串";
    }

    public static void main(String[] args) {
        System.out.println("main方法执行了。。。");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
