package com.suollon.coding.java8.chap8;

import java.util.function.Consumer;

/**
 * @author hzwwl
 * @date 2019/7/17 16:56
 */
public class OnlineBankingLambda {
    public void processUser(int id, Consumer<User> consumer) {
        //通过id查找user
        User user = new User();
        user.setId(id);
        user.setName("kikixi");
        //接受一个行为参数consumer，对目标对象user，执行这个行为；
        consumer.accept(user);
    }
}
