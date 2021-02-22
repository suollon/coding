package com.suollon.coding.designpattern.structural.composite;

/**
 * 叶子节点，不能拥有子节点
 * @author hzwwl
 * @date 2019/7/24 11:07
 */
public class LeafCompany extends AbstractCompany {

    public LeafCompany(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void add(AbstractCompany company) {
        throw new UnsupportedOperationException("不支持操作异常");
    }

    @Override
    public void remove(AbstractCompany company) {
        throw new UnsupportedOperationException("不支持操作异常");
    }

    @Override
    public void display(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("-");
        }
        System.out.println(sb.append(name));
    }
}
