package com.suollon.coding.designpattern.create.abstractfactory;

/**
 * @author hzwwl
 * @date 2019/7/9 13:54
 */
public class PythonSourceFactory extends SourceFactory {
    @Override
    Video getVideo() {
        return new PythonVideo();
    }

    @Override
    Article getArticle() {
        return new PythonArticle();
    }
}
