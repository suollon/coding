package com.suollon.coding.designpattern.create.abstractfactory;

/**
 * @author hzwwl
 * @date 2019/7/9 13:55
 */
public class Test {
    public static void main(String[] args) {
        SourceFactory factory = new JavaSourceFactory();
        Video video = factory.getVideo();
        Article article = factory.getArticle();
        video.produce();
        article.produce();
    }
}
