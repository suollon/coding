package com.suollon.coding.mybatis.logging;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.logging.jdbc.ConnectionLogger;

import java.sql.Connection;
import java.util.logging.Logger;

/**
 * @author hzwwl
 * @date 2019/8/2 16:08
 */
public class LogFactoryTest {

    public static void main(String[] args) {
        //mybatis的日志工厂通过适配器模式，调用不同的log实现；
        Log log1 = LogFactory.getLog(Logger.class);
        Log log2 = LogFactory.getLog(org.apache.logging.log4j.Logger.class);
        Log log3 = LogFactory.getLog(org.slf4j.Logger.class);

        //mybatis的logging包下有一个jdbc包，使用了动态代理对jdbc常用的类做了封装，以便输出日志；
        //1， ConnectionLogger 实现了 InvocationHandler 接口
        //2， ConnectionLogger 的构造器是私有的，只能通过静态方法 newInstance() 构造实例；
        //3，在静态方法 newInstance() 中，调用了 Proxy.newInstance() 方法，生成代理对象；
        Connection proxyConnection = ConnectionLogger.newInstance(null, null, 0);

    }

}
