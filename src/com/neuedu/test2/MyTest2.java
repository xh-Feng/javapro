package com.neuedu.test2;

public class MyTest2 {
    //多线程
    public static void main(String[] args) {
        /**MyThread t1 = new MyThread();
        //启动线程，之后的过程中，run()为入口；若不调用start，调用run()方法仅为调用了一个方法
        t1.start();
        MyThread t2 = new MyThread();
        t2.start();*/

        /**MyThread2 t3 = new MyThread2();
        //Runnable没有直接的start方法 需要以下方式开始
        Thread t= new Thread(t3);
        t.start();*/

        /**MyInterface jia = new MyAdd();
        System.out.println(method(10,10,jia));*/

        /**MyInterface mi = new MyInterface() {
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        };
        System.out.println(method(10,5,mi));*/

        /** 匿名内部类
        System.out.println(method(10, 5, new MyInterface() {
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        }));*/

        /** lambda表达式 必须有个接口 并且接口中只能有一个抽象方法
        System.out.println(method(10,5,(a,b)->{
            return a+b;
        }));*/

        /**匿名内部类2
         Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"线程输出————"+i);
                }
            }
        });
        t4.start();*/

        /** lambda表达式2*/
        Thread t5 = new Thread(()->{
            for (int i = 0; i <= 100; i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"线程输出————"+i);
            }
        });
        t5.start();
    }
    public static int method(int a,int b,MyInterface myInterface){
        return myInterface.method(a,b);
    }

}
