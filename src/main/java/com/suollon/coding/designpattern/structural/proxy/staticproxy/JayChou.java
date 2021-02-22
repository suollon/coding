package com.suollon.coding.designpattern.structural.proxy.staticproxy;

/**
 * @author hzwwl
 * @date 2019/7/25 10:18
 */
public class JayChou implements SingStar {
    @Override
    public void sing() {
        System.out.println("《七里香》，《双节棍》，《以父之名》");
    }

    @Override
    public void dance() {
        System.out.println("抱歉，我周董会打球，不会跳舞。");
    }
}
