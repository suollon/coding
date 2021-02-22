package com.suollon.coding.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hzwwl
 * @date 2019/7/22 20:38
 */
public class ManagerFactory {

    final static Map<String, Manager> MANAGER_CACHE = new HashMap<>();

    public static Manager getManager(String department) {
        Manager manager = MANAGER_CACHE.get(department);
        if (manager == null) {
            System.out.println("创建 " + department + " 部门经理");
            manager = new Manager(department);
            String reportContent = "今年我们 " + department + " 部门取得了非常卓越的成绩。。。";
            System.out.println(department + " 部门经理" + "创建报告内容——" + reportContent);
            manager.setReportContent(reportContent);
            MANAGER_CACHE.put(department, manager);
        }
        return manager;
    }

}
