package com.suollon.coding.designpattern.behavioral.chainofbresponsibility;

/**
 * @author hzwwl
 * @date 2019/7/31 9:32
 */
public abstract class Handler {

    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Holiday holiday);
}
