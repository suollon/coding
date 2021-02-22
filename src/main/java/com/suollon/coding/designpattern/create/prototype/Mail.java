package com.suollon.coding.designpattern.create.prototype;

/**
 * @author hzwwl
 * @date 2019/7/12 10:58
 */
public class Mail implements Cloneable {
    private String name;
    private String address;
    private String content;
    private Boxx boxx;

    public Mail(String name, String address, String content, Boxx boxx) {
        this.name = name;
        this.address = address;
        this.content = content;
        this.boxx = boxx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boxx getBoxx() {
        return boxx;
    }

    public void setBoxx(Boxx boxx) {
        this.boxx = boxx;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                ", boxx=" + boxx +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class Boxx {}