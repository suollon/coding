package com.suollon.coding.designpattern.create.factorymethd;

/**
 * @author hzwwl
 * @date 2019/7/8 17:56
 */
public class PythyVideoFactory extends VideoFactory {
    @Override
    Video getInstance() {
        return new PythyVideo();
    }
}
