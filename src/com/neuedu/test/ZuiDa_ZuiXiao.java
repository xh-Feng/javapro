package com.neuedu.test;

public class ZuiDa_ZuiXiao {
    public static void main(String[] args) {
         //两个正整数 计算最大公约数和最小公倍数
         int x = 6;
         int y = 3;
         int min = 0;
         for(int i = 1; i<=x && i<=y ; i++){
             if(x%i==0&&y%i==0){
                 min = i;
             }
         }
         System.out.println("最大公约数"+min);

         int max = x/min * y/min *min;
         System.out.println("最小公倍数"+max);
    }
}
