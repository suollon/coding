package com.suollon.coding.designpattern.structural.proxy.staticproxy;

/**
 * @author hzwwl
 * @date 2019/7/25 10:20
 */
public class SingStarProxy implements SingStar {

    private SingStar singStar;

    public SingStarProxy(SingStar singStar) {
        this.singStar = singStar;
    }
    @Override
    public void sing() {
        System.out.println("代理人--->联系主办方--->敲定演唱会地址--->确定门票价格--->安排好歌星的住宿问题");
        singStar.sing();
        System.out.println("代理人--->和主办方统计门票收入,分账--->帮歌星收好钱,存入银行");
    }

    @Override
    public void dance() {
        System.out.println("代理人--->联系主办方--->敲定演唱会地址--->确定门票价格--->安排好歌星的住宿问题");
        singStar.dance();
        System.out.println("代理人--->和主办方统计门票收入,分账--->帮歌星收好钱,存入银行");
    }
}
