package com.neuedu.test;

public class Search_oneofsecond {
    public static int search(int[] arry,int index){
        int count = 0;
        int min = 0;
        int max = arry.length-1;
        while(min<=max){
            int mid = (min + max)/ 2;
            count++;
            if (index == arry[mid]){
                System.out.println("查找了"+count+"次");
                return mid;
            }else if(index < arry[mid]){
                max = mid - 1;
            }else {
                min = mid +1;
            }
        }
        return -1;
    }
}
