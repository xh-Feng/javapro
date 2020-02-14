package com.neuedu.mytest;

import java.util.Scanner;

public class Java4 {
    //输入某年某月某日，判断这一天是这一年的第几天
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请按输入年：");
        int year = scanner.nextInt();
        System.out.println("请按输入月：");
        int month = scanner.nextInt();
        if(month<1||month>12) {
            System.out.println("月份输入错误");
            System.exit(0);
        }
        System.out.println("请按输入日：");
        int day = scanner.nextInt();
        CheckDay(year,month,day);

        Out(year,month,day);


    }
    public static boolean CheckYear(int year){
        Boolean a = false;
        if((year%4==0&&year%100!=0)||(year%400==0))
            a = true;
        return a;
    }
    public static void CheckDay(int year,int month,int day){
        if((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&(day>31||day<1)){
            System.out.println("日期输入错误");
            System.exit(0);
        }
        if((month==4||month==6||month==9||month==11)&&(day<1||day>30)){
            System.out.println("日期输入错误");
            System.exit(0);
        }
        if(CheckYear(year)){
            if (month==2&&(day<1||day>29)){System.out.println("日期输入错误");
                System.exit(0);}
        }else {
            if (month==2&&(day<1||day>28)){System.out.println("日期输入错误");
                System.exit(0);}
        }
    }
    public static void Out(int year,int month,int day){
        int i = 0;
        if (CheckYear(year)){
            if(month<3){
                i = 31*(month-1)+day;
            }else if (month<5){
                i = 31*(month-2)+29+day;
            }else if(month<7){
                i = 31*(month-3)+30+29+day;
            }else if(month<10){
                i = 31*(month-4)+30*2+29+day;
            }else if (month<12){
                i = 31*(month-5)+30*3+29+day;
            }else {
                i = 31*6+30*4+29+day;
            }
            System.out.println(year+"年"+month+"月"+day+"日"+"是"+year+"年第"+i+"天");
        }
        else {
            if(month<3){
                i = 31*(month-1)+day;
            }else if (month<5){
                i = 31*(month-2)+28+day;
            }else if(month<7){
                i = 31*(month-3)+30+28+day;
            }else if(month<10){
                i = 31*(month-4)+30*2+28+day;
            }else if (month<12){
                i = 31*(month-5)+30*3+28+day;
            }else {
                i = 31*6+30*4+28+day;
            }
            System.out.println(year+"年"+month+"月"+day+"日"+"是第"+i+"天");
        }
    }
}
