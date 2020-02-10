package com.neuedu.test;

public class MyArray {
    //存储数据的数组
    private int[] array;
    //实际存放的个数
    private int size;
    //创建初始数组
    public MyArray(){
        size = 0;
        array = new int[10];
    }
    //获得存放的数据的个数
    public int getSize() {
        return size;
    }
    //添加数组的数据
    public void add(int i){
        if(size>=array.length){
            //扩大容量的方式 定义一个长度更大的数组 把之前的数组复制进去
            int[] newarray = new int[size+size/2];
            for (int j = 0; j<array.length; j++){
                newarray[j] = array[j];
            }
            array = newarray;
            System.out.println("扩容完成，新数组长度为"+array.length);
        }
        array[size++] = i;
        // 等同于array[size] = i ; size++;
    }
    //通过下标取值
    public int get(int i){
        //取值范围 0~size
        if(i<0 || i>=size){
            System.out.println("索引错误");
            return -1;
        }
        return array[i];
    }
}
