package com.neuedu.test2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/*20200213*/
public class MyTest3 {
    public static int a =0;
    public static Object obj = new Object();
    public static void main(String[] args) {
        /*Thread t1 = new MyThread();
        Thread t2= new MyThread();
        t1.start();
        t2.start();*/
        /*Runnable myThread2 = new MyThread2();
        Thread t3 = new Thread(myThread2);
        Thread t4 = new Thread(myThread2);
        t3.start();
        t4.start();*/
        /*MyThread2 myThread2 = new MyThread2();
        Thread t5 = new Thread(()->{
            myThread2.add();
        });
        Thread t6 = new Thread(()->{
            myThread2.del();
        });
        t5.start();
        t6.start();*/
        Semaphore semaphore = new Semaphore(2);
        /** CountDownLatch创建时就加上了锁的数量
         *      CountDownLatch 对象名 = new CountDownLatch(锁的数量);
         *  方法 await() 代表阻塞  等待全部锁解开为止    当全部锁都解开后 await() 则放行
         *      countdown()每调用一次 表示解一把锁
         * */
        CountDownLatch countDownLatch = new CountDownLatch(5000);
        /*for (int i = 0; i < 19; i++){
            countDownLatch.countDown();
        }
        try {
            countDownLatch.await();
            System.out.println("aaaaaaaa");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        for (int i =0; i <5000; i++){
            Thread t = new Thread(()->{
                /*synchronized (obj){
                    a++;
                    countDownLatch.countDown();
                }*/
                //semaphore.acquire();代表拿一个信号 ()中不传参默认拿一个 传拿参数的个数 但是不能大于总数
                try {
                    semaphore.acquire(2);
                    a++;
                    countDownLatch.countDown();
                    //semaphore.release();代表放一个信号
                    semaphore.release(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });
            t.start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }
}
