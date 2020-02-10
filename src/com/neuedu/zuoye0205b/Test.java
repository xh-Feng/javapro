package com.neuedu.zuoye0205b;

public class Test {
    public static void main(String[] args) {
        SalariedEmployee a = new SalariedEmployee(6000,1);
        HourlyEmployee b = new HourlyEmployee(160,30,2);
        SalesEmployee c = new SalesEmployee(10000,0.2,1);
        System.out.println(a.getSlary());
        System.out.println(b.getSlary());
        System.out.println(c.getSlary());

    }

}
