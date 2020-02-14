package com.neuedu.mytest;

import java.util.ArrayList;
import java.util.List;

public class Java1 {
    //题：有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
    public static void main(String[] args) {
        int[] arry = {1,2,3,4};
        List<Integer> arrayList = new ArrayList<>();
        int count = 0;
        for (int i:arry){
            for (int j:arry){
                for (int k :arry){
                    if (i!=j&&j!=k&&k!=i){
                        count++;
                        arrayList.add(i*100+j*10+k);
                    }
                }
            }
        }
        System.out.println("能组成"+count+"个互不相同且五重复的数字的三位数,它们是：");
        for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));
    }
}
