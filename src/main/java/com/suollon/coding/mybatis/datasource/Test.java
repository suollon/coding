package com.suollon.coding.mybatis.datasource;

/**
 * @author hzwwl
 * @date 2019/8/5 20:13
 */
public class Test {

    // 针对连接池数据源的分析
    // PooledDataSource 的成员变量 PoolState(state) 中持有两个关键属性——
    // List<PooledConnection> idleConnections = new ArrayList<>();  List<PooledConnection> activeConnections = new ArrayList<>();
    // 1，当应用程序在有空闲连接时，要求获取连接；即 idleConnections.size() > 0, 将该连接从【空闲连接池】中去除，同时加入到【活跃连接池】中；
    // 1.1，conn = state.idleConnections.remove(0);
    // 1.2，state.activeConnections.add(conn);
    // 2，当应用程序使用完连接，关闭连接时；即调用 conn.close() , 通过conn的代理类(关键类 PooledConnection )代理close()方法，
    //    在执行 close() 方法时，转而执行 dataSource.pushConnection(this) ，将该线程从【活跃连接池】中去除，同时加入到【空闲连接池】中；
    // 2.1，state.activeConnections.remove(conn);
    // 2.2，state.idleConnections.add(newConn);
    // 由此，形成连接实例的闭环循环利用；（此处未考虑复杂情况，如空闲连接池为空等）

    // 在 PooledDataSource 中，getConnection获取的是代理连接；通过 PooledConnection 生成代理连接；
    //public Connection getConnection(String username, String password) throws SQLException {
    //    return popConnection(username, password).getProxyConnection();
    //}

    // PooledDataSource 使用 PoolState 管理所有的状态，而不自己管理状态的原因，可能是——
    // 避免在 popConnection(..) 方法中锁住整个连接池，即锁住自身；使用 PoolState 后，可以只锁住 PoolState ，同步代价更小。
    // 即把需要锁住的所有状态属性，全部放入到 PoolState 中； PoolState 中除了属性和对应的get方法，也只有一个 toString方法，本身很简单；

}
