package com.neuedu.zuoye0205b;

public abstract class ColaEmployee {
    private char name;
    private int birthday;

    public ColaEmployee(){

    }
    public ColaEmployee(int month) {
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public abstract double getSlary();
}
