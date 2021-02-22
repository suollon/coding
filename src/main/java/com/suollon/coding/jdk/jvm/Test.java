package com.suollon.coding.jdk.jvm;

import java.lang.management.ClassLoadingMXBean;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryManagerMXBean;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hzwwl
 * @date 2019/8/12 11:00
 */
public class Test {

    public static void main(String[] args) throws Exception {
        //打印垃圾收集器信息
        List<GarbageCollectorMXBean> collectorMXBeans = ManagementFactory.getGarbageCollectorMXBeans();
        collectorMXBeans.stream().forEach(c -> System.out.println(c.getName()));

        List<MemoryManagerMXBean> memoryMXBeans = ManagementFactory.getMemoryManagerMXBeans();
        memoryMXBeans.stream().forEach(m -> System.out.println(m.getName()));

        ClassLoadingMXBean classLoadingMXBean = ManagementFactory.getClassLoadingMXBean();
        System.out.println(classLoadingMXBean.getObjectName());

        System.out.println(System.currentTimeMillis());

        //使用完对象（connection，inputStream，outStream）后，为什么要关闭；
        //这里以inputStream举例，虽然 in 是 main() 方法的局部变量，但是 in 是一个有状态的对象，即 channel；
        //channel 可能被其他地方引用，因此无法回收 in，为了确保 in 被回收，所以应该将 channel 置为null；
        //如果局部变量使用的是无状态的对象，则不需要关闭这一步；
        //InputStream in = new FileInputStream("");
        //in.close();


        AtomicInteger atomicInteger = new AtomicInteger(0);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                atomicInteger.getAndIncrement();
            }
        });
        thread.start();
        for (int i = 0; i < 100000; i++) {
            atomicInteger.getAndIncrement();
        }
        System.out.println(atomicInteger);
        thread.join();
        System.out.println(atomicInteger);

    }

}
