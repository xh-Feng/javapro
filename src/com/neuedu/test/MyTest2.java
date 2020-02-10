package com.neuedu.test;

public class MyTest2 {
    public static void main(String[] args) {
         //二分查找
         int[] arry = new int[100000];
         for(int i = 0; i<100000; i++) {
             arry[i] = i+1;
         }
         int a = 80000;
         Search_oneofsecond index = new Search_oneofsecond();
         System.out.println(index.search(arry,a));

    }
}
