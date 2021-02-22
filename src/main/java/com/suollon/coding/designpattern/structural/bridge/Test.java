package com.suollon.coding.designpattern.structural.bridge;

/**
 * @author hzwwl
 * @date 2019/7/23 11:49
 */
public class Test {

    public static void main(String[] args) {
        Bank b1 = new ABCBank(new StreamAccount());
        b1.openAccount("kikixi", "452268413633");
        b1.getInterest(612);

        Bank b2 = new ICBCBank(new FixedAccount());
        b2.openAccount("kai", "15374135445");
        b2.getInterest(558);

        Bank b3 = new ICBCBank(new StreamAccount());
        b3.openAccount("kai", "15374135445");
        b3.getInterest(558);
    }

}
