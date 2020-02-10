package com.neuedu.test;

public class ShuiXianHuaShu {
    public static void main(String[] args) {
        //100~999之间的水仙花数 例如 153 1^3+5^3+3^3=153
         for (int i = 100; i<=999; i++){
             int x = i/100;
            int y = i%100/10; //  i/10%10
            int z = i%10;
            if (x*x*x+y*y*y+z*z*z==i){
                System.out.println(i);
            }
         }
    }
}
