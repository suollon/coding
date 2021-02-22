package com.suollon.coding.designpattern.behavioral.observer.mydefined;

/**
 * @author hzwwl
 * @date 2019/7/29 16:01
 */
public class Test {

    //观察者模式是对象间一对多的关系，被观察者(一)持有观察者(多)的对象
    public static void main(String[] args) {
        Observable bbc = new BBC();
        Observer reader1 = new Reader("小张");
        Observer reader2 = new Reader("小红");
        Observer reader3 = new Reader("小明");
        bbc.add(reader1);
        bbc.add(reader2);
        bbc.add(reader3);

        bbc.notify("孙杨又拿了世锦赛冠军！！！");
        System.out.println("==================================");

        bbc.remove(reader1);
        bbc.notify("中国人两百米跑进20秒啦！！！");
    }

}
