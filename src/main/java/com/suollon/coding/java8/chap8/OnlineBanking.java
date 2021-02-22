package com.suollon.coding.java8.chap8;

/**
 * @author hzwwl
 * @date 2019/7/17 15:42
 */
public abstract class OnlineBanking {

    public void processUser(int id) {
        //通过id查找user
        User user = new User();
        user.setId(id);
        user.setName("kikixi");
        makeUserHappy(user);
    }

    public abstract void makeUserHappy(User user);

}
