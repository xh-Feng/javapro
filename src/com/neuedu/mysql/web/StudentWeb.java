package com.neuedu.mysql.web;


import com.neuedu.mysql.pojo.Student;
import com.neuedu.mysql.service.IstudentService;
import com.neuedu.mysql.service.StudentService;
import com.neuedu.mysql.test.MyTestShow;
import com.neuedu.mysql.util.WebUtil;

import java.util.List;
import java.util.Scanner;

public class StudentWeb {
    IstudentService studentService = new StudentService();
    WebUtil webUtil = new WebUtil();
    public void showmain(){
        webUtil.menu("学生");
        while (true)
            input();
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch(i){
            case 1:
                query();
                break;
            case 2:
                add(scanner);
                break;
            case 3:
                update(scanner);
                break;
            case 4:
                delete(scanner);
                break;
            case 5:
                webUtil.menu("学生");
                break;
            case 6:
                MyTestShow.showmain();
                break;
            case 7:
                System.exit(0);
        }
    }
    public void query(){
        List<Student> list = studentService.query();
        for (Student student:list)
            System.out.println(student);
    }
    public void add(Scanner scanner){
        System.out.println("请输入学号：");
        Integer Sno = scanner.nextInt();
        System.out.println("请输入姓名:");
        String Sname = scanner.next();
        System.out.println("请输入性别:");
        String Ssex = scanner.next();
        System.out.println("请输入年龄:");
        Integer Sage = scanner.nextInt();
        System.out.println("请输入所在系:");
        String Sdept = scanner.next();
        Student student = new Student(Sno,Sname,Ssex,Sage,Sdept);
        //调用服务层add方法
        studentService.add(student);
        System.out.println("添加成功");
    }
    public void update(Scanner scanner){
        System.out.println("请输入要修改的学生的学号：");
        Integer Sno = scanner.nextInt();
        System.out.println("请输入修改后的姓名:");
        String Sname = scanner.next();
        System.out.println("请输入修改后的性别:");
        String Ssex = scanner.next();
        System.out.println("请输入修改后的年龄:");
        Integer Sage = scanner.nextInt();
        System.out.println("请输入修改后的所在系:");
        String Sdept = scanner.next();
        Student student = new Student(Sno,Sname,Ssex,Sage,Sdept);
        //调用服务层update方法
        studentService.update(student);
        System.out.println("修改成功");
    }
    public void delete(Scanner scanner){
        System.out.println("请输入要删除的学生的学号：");
        Integer Sno = scanner.nextInt();

        studentService.delete(Sno);
        System.out.println("删除成功");
    }
}
