package com.suollon.coding.concurrent;

/**
 * @author hzwwl
 * @date 2019/6/18 13:55
 */
public class Test02 {

    public static void main(String[] args) throws InterruptedException {
        String message = String.format("第%s期账单中手动还款提交的线下还款时间，比最近一次部分还款的还款日期时间少于一天，交予财务处理", 8);
        System.out.println(message);
        Test02.class.wait();
        String s = "{\n" +
                "  \"name\":\"小明\",\n" +
                "  \"age\":17,\n" +
                "  \"friends\":[{\"name\":\"xiao1\"},{\"name\":\"xiao2\"}]\n" +
                "}";
    }
}

class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}