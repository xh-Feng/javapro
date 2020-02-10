package com.neuedu.test;

public class MyTest4 {
    public static void main(String[] args) {
        I3 i3 = new I3();
        I5 i5 = new I5();
        I7 i7 = new I7();
        MainBoard mainBoard = new MainBoard();
        mainBoard.setCpu(i5);
        mainBoard.method();
    }
}
