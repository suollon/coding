package com.suollon.coding.designpattern.behavioral.chainofbresponsibility;

/**
 * @author hzwwl
 * @date 2019/7/31 9:50
 */
public class Test {

    /**
     * 2天以内的假期，只需要主管和人事审核即可；
     * 大于2天，小于5天的假期，还需要经理审批才行；
     * 大于5天的假期，直接驳回，不许请假；
     *
     * 在责任链模式中，由几个人审核，在客户端控制；
     * @param args
     */
    public static void main(String[] args) {
        Holiday holiday = new Holiday.Builder()
                .buildName("卡卡西")
                .buildType("调休")
                .buildDays(2)
                .buildReason("在家躺着看《亲热天堂》")
                .build();
        Handler chargeHandler = new ChargeHandler();
        Handler hrHandler = new HRHandler();
        Handler managerHandler = new ManagerHandler();

        //2天以内的假期，只需要主管和HR审核；
        chargeHandler.setNextHandler(hrHandler);
        chargeHandler.handle(holiday);
        System.out.println("===============================");

        //2天以上的假期，需要主管，经理和HR审核；
        holiday.setDays(3);
        chargeHandler.setNextHandler(managerHandler);
        managerHandler.setNextHandler(hrHandler);
        chargeHandler.handle(holiday);
        System.out.println("===============================");

        //5天以上假期不予审批！
        holiday.setDays(7);
        chargeHandler.handle(holiday);
    }

}
