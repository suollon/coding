package com.suollon.coding.mybatis.reflection;

import java.util.Map;

/**
 * @author hzwwl
 * @date 2019/8/1 19:33
 */
public class ZClass<K, V> {

    protected Map<K, V> map;

    public Map<K, V> getMap() {
        return map;
    }

    public void setMap(Map<K, V> map) {
        this.map = map;
    }
}
