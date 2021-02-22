package com.suollon.coding.designpattern.create.abstractfactory;

/**
 * @author hzwwl
 * @date 2019/7/9 9:36
 */
public class JavaArticle extends Article {
    @Override
    void produce() {
        System.out.println("写Java手记");
    }
}
