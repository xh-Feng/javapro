package com.neuedu.zuoye0213;

public class Test3 {
    //一个整数 加100后是一个完全平方数 再加168也是一个完全平方数 该数是多少
    public static void main(String[] args) {
        int x = 0;
        while (true){
            if(Math.sqrt(x+100)%1.0==0&&Math.sqrt(x+168)%1.0==0)
                break;
            x++;
        }
        System.out.println(x);
    }
}
