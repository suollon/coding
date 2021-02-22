package com.suollon.coding.java8.chap11;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import static java.util.stream.Collectors.toList;

/**
 * @author hzwwl
 * @date 2019/7/18 20:15
 */
public class Test2 {

    private static final Executor executor = Executors.newFixedThreadPool(getShops().size(), new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            t.setDaemon(true);
            return t;
        }
    });

    public static void main(String[] args) {
        String product = "shouban";
        List<String> strings = getShops().stream().map(s -> s.getPrice(product)).map(Quote::parse).map(Discount::applyDiscount).collect(toList());
        System.out.println(strings);

        List<CompletableFuture<String>> strings2 = getShops().stream().map(s -> CompletableFuture.supplyAsync(() -> s.getPrice(product), executor))
                .map(future -> future.thenApply(Quote::parse))
                .map(future -> future.thenCompose(quote -> CompletableFuture.supplyAsync(() -> Discount.applyDiscount(quote), executor)))
                .collect(toList());
        System.out.println(strings2);

    }

    private static List<Shop> getShops() {
        return Arrays.asList(new Shop("Maidanglao"),
                new Shop("kendeji"),
                new Shop("zhenghongfu"),
                new Shop("waipojia"));
    }

}
