package com.suollon.coding.java8.chap5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @author hzwwl
 * @date 2019/7/15 20:13
 */
public class Test2 {
    public static void main(String[] args) {
        List<Transaction> transactions = buildTransactions();

        List<Transaction> t2011s = transactions.stream().filter(t -> t.getYear() == 2011).sorted(comparing(Transaction::getValue)).collect(toList());
        System.out.println(t2011s);
        List<String> citys = transactions.stream().map(Transaction::getTrader).map(Trader::getCity).distinct().collect(toList());
        System.out.println(citys);
        List<String> cambridges = transactions.stream().map(Transaction::getTrader).filter(t -> "Cambridge".equals(t.getCity())).map(Trader::getName).distinct().sorted(String::compareTo).collect(toList());
        System.out.println(cambridges);
        List<String> names = transactions.stream().map(Transaction::getTrader).map(Trader::getName).distinct().collect(toList());
        System.out.println(names);
        Optional<Trader> any = transactions.stream().map(Transaction::getTrader).filter(t -> "Milan".equals(t.getCity())).findAny();
        System.out.println(any.isPresent());
        Integer sum = transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity())).map(Transaction::getValue).reduce(0, Integer::sum);
        System.out.println(sum);
        Integer max = transactions.stream().map(Transaction::getValue).reduce(0, Integer::max);
        System.out.println(max);
        //取出最小交易额
        Optional<Integer> min = transactions.stream().map(Transaction::getValue).reduce(Integer::min);
        System.out.println(min.get());
        //这是错误的方式，因为将初始值0，也放入了比较的范围；
        Integer minValue = transactions.stream().map(Transaction::getValue).reduce(0, Integer::min);
        System.out.println(minValue);
    }

    public static List<Transaction> buildTransactions() {
        Trader t1 = new Trader("Raoul", "Cambridge");
        Trader t2 = new Trader("Mario", "Milan");
        Trader t3 = new Trader("Alan", "Cambridge");
        Trader t4 = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(t4, 2011, 300),
                new Transaction(t1, 2012, 1000),
                new Transaction(t1, 2011, 400),
                new Transaction(t2, 2012, 710),
                new Transaction(t2, 2012, 700),
                new Transaction(t3, 2012, 950)
        );
        return transactions;
    }

}
