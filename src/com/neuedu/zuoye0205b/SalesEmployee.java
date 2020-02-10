package com.neuedu.zuoye0205b;

public class SalesEmployee extends ColaEmployee {
    //按月销售额和提成率拿工资的员工
    private int sales;
    private double ticheng;
    public SalesEmployee(){

    }
    public SalesEmployee(int sales,double ticheng,int month){
        super(month);
        this.sales = sales;
        this.ticheng = ticheng;
    }
    @Override
    public double getSlary() {
        //按月销售额和提成率拿工资的员工
        double a = sales * ticheng;
        return a;
    }
}
