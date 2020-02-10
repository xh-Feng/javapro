package com.neuedu.zuoye0205b;

public class HourlyEmployee extends ColaEmployee {
    //拿小时工资的员工
    private int worktime;
    private int hourly;
    public HourlyEmployee(){

    }
    public HourlyEmployee(int worktime,int hourly,int month){
        super(month);
        this.worktime = worktime;
        this.hourly = hourly;
    }
    @Override
    public double getSlary() {
        //每月工作超出160 小时的部分按照1.5 倍工资发放
        if (worktime < 0){
            System.out.println("输入工作时间有误");
            return 0;
        }else if(worktime <= 160){
            return worktime*hourly;
        }else {
            double x = 160*hourly+(worktime-160)*hourly*1.5;
            return x;
        }

    }
}
