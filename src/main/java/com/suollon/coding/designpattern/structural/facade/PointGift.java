package com.suollon.coding.designpattern.structural.facade;

/**
 * @author hzwwl
 * @date 2019/7/15 9:48
 */
public class PointGift {
    private String name;

    private int point;

    public PointGift() {
    }

    public PointGift(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "PointGift{" +
                "name='" + name + '\'' +
                ", point=" + point +
                '}';
    }
}
