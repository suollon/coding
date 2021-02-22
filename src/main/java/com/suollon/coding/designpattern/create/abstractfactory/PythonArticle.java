package com.suollon.coding.designpattern.create.abstractfactory;

/**
 * @author hzwwl
 * @date 2019/7/9 9:37
 */
public class PythonArticle extends Article {
    @Override
    void produce() {
        System.out.println("写Python手记");
    }
}
