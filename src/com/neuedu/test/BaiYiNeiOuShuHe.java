package com.neuedu.test;

public class BaiYiNeiOuShuHe {
    public static void main(String[] args) {
         //打印百以内偶数和
         int sum = 0;
         for(int i=0; i<=100; i++){
             if(i%2==0){
                 sum = sum + i;
             }
         }
         System.out.println(sum);
    }
}
