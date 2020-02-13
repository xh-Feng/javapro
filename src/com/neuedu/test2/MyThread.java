package com.neuedu.test2;

public class MyThread extends Thread {
    private int count = 40;
    @Override
    public void run() {
        /**0212
         for (int i = 0; i <=100; i++){
            try {
                //表示500毫秒内，该线程不会抢占CPU。
                // 但是不代表500毫秒后就会执行，而是500毫秒后继续抢占CPU，却不知道能不能抢占到。
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Thread.currentThread()获取当前正在执行的线程
            //线程对象下有个getName()返回线程名
            //Thread.currentThread().getName()也可写成this.getName(),但是不知道什么情况下不可以
            System.out.println(Thread.currentThread().getName()+"线程输出————————"+i);
        }*/
        /**0213*/
        while (count>0){
            System.out.println(Thread.currentThread().getName()+"卖出了第"+count+"张票");
            count--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
