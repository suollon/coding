package com.suollon.coding.designpattern.create.abstractfactory;

/**
 * @author hzwwl
 * @date 2019/7/9 13:53
 */
public class JavaSourceFactory extends SourceFactory {
    @Override
    Video getVideo() {
        return new JavaVideo();
    }

    @Override
    Article getArticle() {
        return new JavaArticle();
    }
}
