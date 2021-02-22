package com.suollon.coding.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hzwwl
 * @date 2019/7/24 10:53
 */
public class Company extends AbstractCompany {

    List<AbstractCompany> companies = new ArrayList<>();

    public Company(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void add(AbstractCompany company) {
        companies.add(company);
    }

    @Override
    public void remove(AbstractCompany company) {
        companies.remove(company);
    }

    @Override
    public void display(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("-");
        }
        System.out.println(sb.toString() + name);
        companies.stream().forEach(c -> c.display(n + 2));
    }
}
