package com.suollon.coding.mybatis.reflection;

/**
 * @author hzwwl
 * @date 2019/7/31 9:38
 */
public class Holiday{

    private String name;
    private int days;

    public Holiday() {
    }

    public Holiday(Builder builder) {
        this.name = builder.name;
        this.days = builder.days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "name='" + name + '\'' +
                ", days=" + days +
                '}';
    }

    public static class Builder{
        private String name;
        private int days;

        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildDays(int days) {
            this.days = days;
            return this;
        }

        public Holiday build() {
            return new Holiday(this);
        }
    }
}
