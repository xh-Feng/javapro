package com.neuedu.test;

public class MyTest3 {
    public static void main(String[] args) {
         //自定义动态整型数组
         // * 使用object后可以存放所有类型 Object[] a = new Object[5]
         MyArray a = new MyArray();

         for(int i = 1; i <= 100; i++){
             a.add(i);
         }

         for (int i = 0; i<a.getSize(); i++){
             System.out.println(a.get(i));
         }
    }
}
