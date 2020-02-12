package com.neuedu.zuoye0211;

import java.util.ArrayList;
import java.util.Random;

public class RandomSettings {
    public void Settings(String[] arr,int n){
        int count=0;
        ArrayList array = new ArrayList();
        a:while(true){
            b:while(true){
                if(count<(n+3)){
                    int ar = new Random().nextInt((n+3));
                    if(arr[ar]!=null){
                        array.add(arr[ar]);
                        arr[ar]=null;
                        count++;
                    }
                }
                //所有牌排好顺序后跳出本循环
                if(count>=(n+3)){break b;}
            }
            //判断前n张牌是否有盗贼，狼人数是否大于等于4，都满足就跳出整个循环
            int count2 = 0;
            for(int i = 0; i <= array.size()-3;i++){
                if(array.get(i).toString().equals("狼人")){count2++;}
                if(array.get(i).toString().equals("盗贼")&&count2>=4){break a;}
            }
        }
        //打印牌名
        for (int i = 0; i<array.size();i++){
            if (i<n){
                System.out.println(array.get(i));
            }else{
                System.out.println("底牌："+array.get(i));
            }
        }
    }
}
