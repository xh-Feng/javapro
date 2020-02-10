package com.neuedu.test;

public class CheckYear {
    private int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void main() {
        if ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
            System.out.println("闰年");
        } else {
            System.out.println("平年");
        }
    }
}
