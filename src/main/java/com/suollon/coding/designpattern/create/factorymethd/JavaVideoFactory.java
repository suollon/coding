package com.suollon.coding.designpattern.create.factorymethd;

/**
 * @author hzwwl
 * @date 2019/7/8 17:55
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    Video getInstance() {
        return new JavaVideo();
    }
}
