package com.suollon.coding.designpattern.structural.composite;

/**
 * @author hzwwl
 * @date 2019/7/24 11:15
 */
public class Test {

    public static void main(String[] args) {
        AbstractCompany centerCompany = new Company("中国总公司");
        AbstractCompany zhejiangCompany = new Company("浙江分公司");
        AbstractCompany hubeiCompany = new Company("湖北分公司");
        AbstractCompany guangdongCompany = new Company("广东分公司");
        centerCompany.add(zhejiangCompany);
        centerCompany.add(hubeiCompany);
        centerCompany.add(guangdongCompany);
        AbstractCompany wuhanCompany = new Company("武汉分公司");
        AbstractCompany xiangyangCompany = new Company("襄阳分公司");
        AbstractCompany jingzhouCompany = new Company("荆州分公司");
        hubeiCompany.add(wuhanCompany);
        hubeiCompany.add(xiangyangCompany);
        hubeiCompany.add(jingzhouCompany);
        AbstractCompany hangzhouCompany = new Company("杭州分公司");
        zhejiangCompany.add(hangzhouCompany);

        AbstractCompany hrDepartment = new LeafCompany("人事部门");
        AbstractCompany caiwuDepartment = new LeafCompany(" 财务部门");
        AbstractCompany ITDepartment = new LeafCompany(" 技术部门");
        wuhanCompany.add(hrDepartment);
        wuhanCompany.add(caiwuDepartment);
        wuhanCompany.add(ITDepartment);
        //hrDepartment.add(caiwuDepartment);

        centerCompany.display(0);
        hubeiCompany.display(0);
    }

}
