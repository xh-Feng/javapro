package com.neuedu.test;

public class SanShuZuHe {
    public static void main(String[] args) {
        //打印随机三数的组合
         int[] arry = {1,2,3,4};
         for(int a :arry){
             for(int b:arry){
                 for(int c:arry){
                     if(a!=b && b!=c && a!=c){
                         System.out.println(a*100+b*10+c);
                     }
                 }
             }
         }
    }
}
