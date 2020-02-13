package com.neuedu.zuoye0213;

import java.util.Scanner;

public class Test2 {
    //一个球从100米高度落下，每次落地后反弹到原高度的一半，求第10次落地后 反弹多高
    public static void main(String[] args) {
        System.out.println("请输入高度，次数：");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();/*100;*/
        int n = s.nextInt();
        method(x,n);
    }
    public static void method(double x,int n){
        for (int i = 0; i <= n; i++)
            x = x/2;

        System.out.println(n+"次后反弹"+x);
    }
}
