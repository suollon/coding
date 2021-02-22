package com.suollon.coding.designpattern.create.prototype;

/**
 * @author hzwwl
 * @date 2019/7/12 10:58
 */
public class MailDeepth implements Cloneable {
    private String name;
    private String address;
    private String content;
    private Box box;

    public MailDeepth(String name, String address, String content, Box box) {
        this.name = name;
        this.address = address;
        this.content = content;
        this.box = box;
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

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return "MailDeepth{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                ", box=" + box +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        MailDeepth clone = (MailDeepth) super.clone();
        clone.box = (Box) box.clone();
        return clone;
    }
}

class Box implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
