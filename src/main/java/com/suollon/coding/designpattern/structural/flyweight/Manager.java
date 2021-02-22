package com.suollon.coding.designpattern.structural.flyweight;

/**
 * @author hzwwl
 * @date 2019/7/22 20:36
 */
public class Manager implements Employee {

    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
