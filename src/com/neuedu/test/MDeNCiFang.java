package com.neuedu.test;

public class MDeNCiFang {
    public static void main(String[] args) {
         //定义m、n 计算m的n次方
         int m = 2;
         int n = 3;
         int x = 1;
         for (int i = 0; i < n; i++){
             x = x * m;
         }
         System.out.println(x);
    }
}
