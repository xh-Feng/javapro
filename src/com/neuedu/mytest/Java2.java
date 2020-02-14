package com.neuedu.mytest;

import java.util.Scanner;

public class Java2 {
    /** 题：企业发放的奖金根据利润提成。利润I 低于或等于10万元时，奖金可提10%；
     * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分可提成7.5%
     * 20万元到40万元之间时，高于20万元的部分可提成5%
     * 40万元到60万元之间时，高于40万元的部分可提成3%
     * 60万元到100万元之间时，高于60万元的部分可提成1.5%
     * 高于100万元时，超出100万元的部分按1%提成
     * 从键盘输入当月利润I  求应发放奖金总数
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        jiangjin(I);
    }
    public static void jiangjin(int I){
        double jiang = 0;
        if (I > 1000000){
            jiang = jiang + (I-1000000)*0.01;
            I = I - (I-1000000);
        }
        if (I > 600000){
            jiang = jiang + (I-600000)*0.015;
            I = I - (I-600000);
        }
        if (I > 400000){
            jiang = jiang + (I-400000)*0.03;
            I = I - (I-400000);
        }
        if (I > 200000){
            jiang = jiang + (I-200000)*0.05;
            I = I - (I-200000);
        }
        if (I > 100000){
            jiang = jiang + (I-100000)*0.075;
            I = I - (I-100000);
        }
        if (I > 0)
            jiang = jiang + I*0.1;
        System.out.println(jiang);
    }
}
