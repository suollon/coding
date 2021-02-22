package com.suollon.coding.designpattern.create.prototype;

/**
 * @author hzwwl
 * @date 2019/7/12 11:01
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅拷贝
        Mail mail = new Mail("kikixi", "火影村", "你好呀", new Boxx());
        Mail newMail = (Mail) mail.clone();
        System.out.println(mail);
        System.out.println(newMail);
        System.out.println("拷贝后是不同的对象：" + (mail == newMail));
        System.out.println("浅拷贝后是相同的属性：" + (mail.getAddress() == newMail.getAddress()));
        System.out.println("浅拷贝后是相同的属性：" + (mail.getBoxx() == newMail.getBoxx()));

        //深拷贝
        MailDeepth maild = new MailDeepth("kikixi", "火影村", "你好呀", new Box());
        MailDeepth newMaild = (MailDeepth) maild.clone();
        System.out.println(maild);
        System.out.println(newMaild);
        System.out.println("拷贝后是不同的对象：" + (maild == newMaild));
        System.out.println("深拷贝后是相同的属性：" + (maild.getAddress() == newMaild.getAddress()));
        //box重写了clone()方法；
        System.out.println("深拷贝后是不同的属性：" + (maild.getBox() == newMaild.getBox()));

    }
}
