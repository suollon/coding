package com.suollon.coding.designpattern.behavioral.templatemethod;

/**
 * @author hzwwl
 * @date 2019/7/26 9:23
 */
public abstract class Cookie {

    //模板方法；
    public void cookieTemplate(){
        pourOil();
        addSalt();
        if(isAddChili()) {
            addChili();
        }
        cookieCare();
        putInDish();
    }

    public final void pourOil() {
        System.out.println("准备适量的油");
    }

    public final void addSalt() {
        System.out.println("准备适量的盐");
    }

    public final void addChili() {
        System.out.println("准备适量的辣椒");
    }

    public abstract void cookieCare();

    public final void putInDish() {
        System.out.println("装盘");
    }

    //钩子方法；
    public boolean isAddChili() {
        return false;
    }
}
