package com.neuedu.mysql.test;

import com.neuedu.mysql.web.CourseWeb;
import com.neuedu.mysql.web.StudentWeb;

import java.util.Scanner;

public class MyTestShow {
    public static void main(String[] args) {
        showmain();
    }
    public static void showmain(){
        menu();
        input();
    }
    public static void menu(){
        System.out.println("***菜单***************");
        System.out.println("**1—————————————学生**");
        System.out.println("**2—————————————课程**");
        System.out.println("**3—————————————退出**");
        System.out.println("**********************");
    }
    public static void input(){
        StudentWeb studentWeb = new StudentWeb();
        CourseWeb courseWeb = new CourseWeb();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch(i){
            case 1:
                studentWeb.showmain();
                break;
            case 2:
                courseWeb.showmain();
                break;
            case 3:
                System.exit(0);
        }
    }
}
