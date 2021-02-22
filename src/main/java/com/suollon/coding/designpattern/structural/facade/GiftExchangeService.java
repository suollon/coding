package com.suollon.coding.designpattern.structural.facade;

/**
 * @author hzwwl
 * @date 2019/7/15 9:56
 */
public class GiftExchangeService {
    QualifyService qualifyService = new QualifyService();
    PointExchangeService pointExchangeService = new PointExchangeService();
    PostService postService = new PostService();

    public void execute(PointGift pointGift){
        qualifyService.execute(pointGift);
        pointExchangeService.execute(pointGift);
        postService.execute(pointGift);
    }
}
