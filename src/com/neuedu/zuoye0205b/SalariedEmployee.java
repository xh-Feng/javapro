package com.neuedu.zuoye0205b;

public class SalariedEmployee extends ColaEmployee {
    //固定工资的员工
    private int salaried;
    public SalariedEmployee(){

    }
    public SalariedEmployee(int salaried,int month){
        super(month);
        this.salaried = salaried;
    }
    @Override
    public double getSlary() {
        return salaried;
    }
}
