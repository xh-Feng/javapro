package com.neuedu.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
         //定义一个Arraylist和Linkedlist比较他们读和写的性能差异
        List ArrayList = new ArrayList();
        Date stararray = new Date();
        for (int i = 0; i < 1000000; i++){
            ArrayList.add(i+1);
        }
        Date endarray = new Date();
        System.out.println("ArrayList从队尾存储用时："+(endarray.getTime()-stararray.getTime()));
        Date stararray2 = new Date();
        for (int i = 0; i < 1000000; i++){
            ArrayList.add(0,i+1);
        }
        Date endarray2 = new Date();
        System.out.println("ArrayList从队中存储用时："+(endarray2.getTime()-stararray2.getTime()));
        Date starReadarry = new Date();
        for (int i = 0; i < ArrayList.size(); i++){
            Object obj = ArrayList.get(i);
        }
        Date endReadarry = new Date();
        System.out.println("ArrayList读取用时："+(endReadarry.getTime()-starReadarry.getTime()));
        List LinkedList = new LinkedList();
        Date starLinked = new Date();
        for (int i = 0; i < 1000000; i++){
            LinkedList.add(i+1);
        }
        Date endLinked = new Date();
        System.out.println("LinkedList从队尾存储用时："+(endLinked.getTime()-starLinked.getTime()));
        Date starLinked2 = new Date();
        for (int i = 0; i < 1000000; i++){
            LinkedList.add(0,i+1);
        }
        Date endLinked2 = new Date();
        System.out.println("LinkedList从队尾存储用时："+(endLinked2.getTime()-starLinked2.getTime()));
        Date starReadLinked = new Date();
        for (int i = 0; i < ArrayList.size(); i++){
            Object obj = ArrayList.get(i);
        }
        Date endReadLinked = new Date();
        System.out.println("LinkedList读取用时："+(endReadLinked.getTime()-starReadLinked.getTime()));
    }

}
