package com.neuedu.zuoye0213;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    //n个人围坐在一个圈子里 从1开始报数 报到3的时候 离开  最后剩下的是第几个人
    public static void main(String[] args) {

        System.out.println(method(1000));
    }

    public static int method(int n){
        List<Integer> list = new ArrayList<>();
        //创建数组
        for (int i = 1; i<=n;i++)
            list.add(i);
        //循环取出报数为3的人
        int m = 1;
        while (list.size()>1){
            //如果不等于3，把第一个放到最后一个
            if (m!=3){
                int first = list.remove(0);
                list.add(first);
                m++;
            }else{
                //如果等于3，取出数据，并重置m值
                list.remove(0);
                m=1;
            }
        }
        //返回最后放在第一个序号的值
        return list.get(0);
    }
}
