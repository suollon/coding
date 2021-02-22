package com.suollon.coding.designpattern.structural.composite.v1;

/**
 * @author hzwwl
 * @date 2019/7/23 14:42
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(){

    }

    public FinanceDepartment(String name){
        super(name);
    }

    @Override
    protected void add(Company company) {

    }

    @Override
    protected void display(int depth) {
        StringBuilder sb = new StringBuilder("|");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb) + this.getName() ) ;
    }

    @Override
    protected void romove(Company company) {

    }
}
