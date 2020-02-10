package com.neuedu.test;

public class MaoPao {
    public static void main(String[] args) {
         //冒泡排序
         int[] arry = {5,2,1,51,100,45,68,74,22,90,20};
         for (int i = 0;i < arry.length-1;i++){
             int flag = 0;
             for (int j = 0; j < arry.length-(i+1); j++){
                 if(arry[j] > arry[j+1]){
                     int temp = arry[j];
                     arry[j] = arry[j+1];
                     arry[j+1] = temp;
                     flag++;
                 }
             }
             if(flag==0){
                 break;
             }
         }
         for (int i : arry){
             System.out.println(i);
         }

    }
}
