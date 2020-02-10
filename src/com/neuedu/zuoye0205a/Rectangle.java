package com.neuedu.zuoye0205a;

public class Rectangle extends Shape {
    //矩形类
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public Rectangle(){
        super();
    }
    public Rectangle(String color){
        super(color);
    }
    public Rectangle(double height,double width,String color){
        this.height = height;
        this.width = width;
        this.setColor(color);
    }
    //周长
    @Override
    public double getPer() {
        return ((height+width)*2);
    }
    //面积
    @Override
    public double getArea() {
        return (height*width);
    }
    //所有
    @Override
    public String showAll() {
        double a = height*width;
        double b = (height+width)*2;
        String c = getColor();
        return ("该矩形的各项数据：\n面积："+a+"\n周长："+b+"\n颜色："+c);
    }
}
