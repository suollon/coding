package com.suollon.coding.designpattern.structural.facade;

/**
 * @author hzwwl
 * @date 2019/7/15 9:44
 */
public class QualifyService {

    public boolean execute(PointGift pointGift) {
        System.out.println(pointGift.getName() + "权限校验通过");
        return true;
    }
}
