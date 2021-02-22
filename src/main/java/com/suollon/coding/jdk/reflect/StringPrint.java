package com.suollon.coding.jdk.reflect;

/**
 * @author hzwwl
 * @date 2019/8/5 15:11
 */
public class StringPrint implements Print<String> {
    @Override
    public void print() {
        System.out.println("系统消息，Hello world ！！");
    }

    @Override
    public void print(String string) {
        System.out.println("字符串打印，宽高比为1，不倾斜：" + string);
    }
}

/*
javap -c StringPrint

        警告: 二进制文件StringPrint包含com.example.demo.reflect.StringPrint
        Compiled from "StringPrint.java"
public class StringPrint implements Print<java.lang.String> {
public StringPrint();
        Code:
        0: aload_0
        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
        4: return

public void print();
        Code:
        0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        3: ldc           #3                  // String 系统消息，Hello world ！！

        5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        8: return

public void print(java.lang.String);
        Code:
        0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
        3: new           #5                  // class java/lang/StringBuilder
        6: dup
        7: invokespecial #6                  // Method java/lang/StringBuilder."<init>":()V
        10: ldc           #7                  // String 字符串打印，宽高比为1，不倾斜：
        12: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        15: aload_1
        16: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        19: invokevirtual #9                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        22: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        25: return

public void print(java.lang.Object);
        Code:
        0: aload_0
        1: aload_1
        2: checkcast     #10                 // class java/lang/String
        5: invokevirtual #11                 // Method print:(Ljava/lang/String;)V
        8: return
        }
*/
