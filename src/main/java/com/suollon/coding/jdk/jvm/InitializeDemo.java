package com.suollon.coding.jdk.jvm;

/**
 * 类加载遇到【类自身的静态对象t1，t2】时，可以忽略类未加载完成的事实，直接创建对象（这个过程不需要初始化静态字段和静态代码块，但需要初始化非静态字段和代码块）。
 * 反过来考虑，如果要先加载完类自身，才能初始化t1，t2那就无线递归了。
 *
 * @author hzwwl
 * @date 2019/8/12 15:41
 */
public class InitializeDemo {
    public static int k = 1;                                          // 1
    //出现的静态语句块之前的静态属性，可以赋值，可以访问；
    //出现在静态语句块之后的静态属性，可以赋值，不可以访问；
    static {
        System.out.println(k);
        //System.out.println(t1);
    }
    public static InitializeDemo t1 = new InitializeDemo("t1");   // 2
    public static InitializeDemo t2 = new InitializeDemo("t2");   // 3
    public static int i = print("静态成员变量--i");                   // 4
    public static int n = 99;                                         // 5

    static {
        print("静态代码块");                                           // 6
    }

    public int j = print("非静态成员变量--j");    // 2.1  3.1  7.1

    {
        print("非静态代码块");                     // 2.2  3.2  7.2
    }

    public InitializeDemo(String str) {
        System.out.println("构造器" + (k++) + ":" + str + "   i=" + i + "    n=" + n);
        ++i;                                      // 2.3  3.3  7.3
        ++n;
    }

    public static void main(String args[]) {
        //InitializeDemo.print("3333");
        new InitializeDemo("主函数--init");                       // 7
    }

    public static int print(String str) {
        System.out.println("静态方法print()" + (k++) + ":" + str + "   i=" + i + "    n=" + n);
        ++n;
        return ++i;
    }
}
