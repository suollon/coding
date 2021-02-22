package com.suollon.coding.designpattern.create.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author hzwwl
 * @date 2019/7/9 12:46
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /*Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
        System.out.println("finish!");*/

        //序列化破坏
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("new_file"));
        oos.writeObject(Hungry.getInstance());
        ObjectInputStream qis = new ObjectInputStream(new FileInputStream("new_file"));
        Hungry hungry = (Hungry) qis.readObject();
        System.out.println(System.identityHashCode(hungry));

        //反射破坏
        Hungry instance = Hungry.getInstance();
        Constructor constructor = Hungry.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Hungry newInstance = (Hungry) constructor.newInstance();
        System.out.println(System.identityHashCode(Hungry.getInstance()));
        System.out.println(System.identityHashCode(newInstance));
    }
}
