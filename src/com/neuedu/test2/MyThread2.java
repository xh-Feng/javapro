package com.neuedu.test2;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=100; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程输出————————"+i);
        }
    }
}
