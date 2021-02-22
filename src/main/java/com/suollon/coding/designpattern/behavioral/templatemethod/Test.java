package com.suollon.coding.designpattern.behavioral.templatemethod;

/**
 * @author hzwwl
 * @date 2019/7/26 9:49
 */
public class Test {

    public static void main(String[] args) {
        Cookie duoJiaoYuTou = new DuoJiaoYuTou();
        Cookie xiaoBaiCaiJianDouFu = new XiaoBaiCaiJianDouFu();
        duoJiaoYuTou.cookieTemplate();
        System.out.println("====================================");
        xiaoBaiCaiJianDouFu.cookieTemplate();
    }

}
