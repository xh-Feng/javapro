package com.neuedu.zuoye0205a;

public class Test {
    public static void main(String[] args) {
        Rectangle a = new Rectangle("blue");
        a.setHeight(3.2);
        a.setWidth(4.5);
        System.out.println(a.showAll());
        Circle b = new Circle("red");
        b.setRadius(2);
        System.out.println(b.showAll());
    }

}
