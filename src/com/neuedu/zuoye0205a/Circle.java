package com.neuedu.zuoye0205a;

public class Circle extends Shape {
    //圆类
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(){
        super();
    }
    public Circle(int radius){
        this.radius = radius;
    }
    public Circle(String color){
        super(color);
    }
    //面积
    @Override
    public double getArea() {
        return (radius*3.14);
    }

    @Override
    public double getPer() {
        return (radius*3.14*2);
    }

    @Override
    public String showAll() {
       double a = radius*3.14;
       double b = radius*3.14*2;
       String c = getColor();
       return ("该圆形的各项数据：\n面积："+a+ "\n周长："+b+"\n颜色："+c);
    }
}
