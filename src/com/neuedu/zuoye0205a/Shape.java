package com.neuedu.zuoye0205a;

public abstract class Shape {
    //图形类
    private double area;
    private double per;
    private String color;

    public Shape(){

    }

    public Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    //设置面积
    public void setArea(double area) {
        this.area = area;
    }
    //设置周长
    public void setPer(double per) {
        this.per = per;
    }
    //设置颜色
    public void setColor(String color) {
        this.color = color;
    }

    //计算面积
    public abstract double getArea();
    //计算周长
    public abstract double getPer();
    //输出所有信息
    public abstract String showAll();
}
