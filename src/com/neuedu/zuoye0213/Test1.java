package com.neuedu.zuoye0213;

public class Test1 {
    //输出斐波那契数列 1 1 2 3 5 8 13
    public static void main(String[] args) {
        System.out.println("斐波那契数列:");
        int i = 1;
        int sum = 0;
        System.out.println(i);
        while(sum>=0){
            sum = sum + i;
            i = sum - i;
            if(sum>0)
                System.out.println(sum);
        }
    }
}
