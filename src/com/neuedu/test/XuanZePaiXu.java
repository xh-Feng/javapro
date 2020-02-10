package com.neuedu.test;

public class XuanZePaiXu {
    public static void main(String[] args) {
         //选择排序
         int[] arry = {5,2,1,51,100,45,68,74,22,90,20};
         for(int i = 0; i<arry.length; i++){
             for(int j = 0; j<arry.length; j++){
                 if(arry[i]<arry[j]){
                     int a = arry[j];
                     arry[j] = arry[i];
                     arry[i] = a;
                 }
             }
         }

         for (int i :arry){
             System.out.println(i);
         }

    }
}
