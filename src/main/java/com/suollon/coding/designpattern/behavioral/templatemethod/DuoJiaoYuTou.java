package com.suollon.coding.designpattern.behavioral.templatemethod;

/**
 * @author hzwwl
 * @date 2019/7/26 9:44
 */
public class DuoJiaoYuTou extends Cookie {

    @Override
    public void cookieCare() {
        System.out.println("将辣椒洒在清洁好的鱼头上，放进锅里蒸熟");
    }

    @Override
    public boolean isAddChili() {
        return true;
    }
}
