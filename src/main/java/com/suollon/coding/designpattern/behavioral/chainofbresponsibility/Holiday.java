package com.suollon.coding.designpattern.behavioral.chainofbresponsibility;

/**
 * @author hzwwl
 * @date 2019/7/31 9:38
 */
public class Holiday {

    private String name;
    private String type;
    private int days;
    private String reason;

    public Holiday() {
    }

    public Holiday(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.days = builder.days;
        this.reason = builder.reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", days=" + days +
                ", reason='" + reason + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private String type;
        private int days;
        private String reason;

        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildType(String type) {
            this.type = type;
            return this;
        }

        public Builder buildDays(int days) {
            this.days = days;
            return this;
        }

        public Builder buildReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Holiday build() {
            return new Holiday(this);
        }
    }
}
