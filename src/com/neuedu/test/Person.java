package com.neuedu.test;

public class Person {
    private int no;
    private char sex;
    private int age;

    public void work(){
        System.out.println("人会工作");
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if(sex=='男'||sex=='女'){
            this.sex = sex;
        }else{
            System.out.println("输入错误，必须输入男或女，默认为男");
            this.sex = '男';
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=150 && age>=0){
            this.age = age;
        }else{
            System.out.println("输入错误，年龄应在0~150之间，默认为1");
            this.age = 1;
        }
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
