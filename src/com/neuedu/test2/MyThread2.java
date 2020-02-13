package com.neuedu.test2;

public class MyThread2 implements Runnable{
    Object obj = new Object();
    private int count = 80;
    @Override
    public void run() {
        /**0212
        for (int i = 0; i <=100; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程输出————————"+i);
        }*/
        /**0213*/
        while (count>0){
            /**线程同步 synchronized (锁旗标（任何一个对象都可以）){
             *
             *
             *  }
             *  被synchronized包裹的语句 如果要执行 就必须先拿到锁旗标
             *  如果已被其他线程拿到 就要等待 等待其他线程执行完放开之后再拿
             *  即synchronized包裹的语句一次只被一个线程执行
             *
             * synchronized可以加在代码块上 也可以用来修饰方法
             * 如果synchronized修饰在方法上 默认锁旗标为this
             */
            synchronized(obj){
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
    public void add(){
        while (true){
            System.out.println("add");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void del(){
        while (true){
            System.out.println("del");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
