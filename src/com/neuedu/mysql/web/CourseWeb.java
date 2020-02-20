package com.neuedu.mysql.web;


import com.neuedu.mysql.pojo.Course;
import com.neuedu.mysql.pojo.Student;
import com.neuedu.mysql.service.CourseService;
import com.neuedu.mysql.service.IcourseService;
import com.neuedu.mysql.test.MyTestShow;
import com.neuedu.mysql.util.WebUtil;


import java.util.List;
import java.util.Scanner;

public class CourseWeb {
    IcourseService courseService = new CourseService();
    WebUtil webUtil = new WebUtil();
    public void showmain(){
        webUtil.menu("课程");
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
                webUtil.menu("课程");
                break;
            case 6:
                MyTestShow.showmain();
                break;
            case 7:
                System.exit(0);
        }
    }
    public void query(){
        List<Course> list = courseService.query();
        for (Course course:list)
            System.out.println(course);
    }
    public void add(Scanner scanner){
        System.out.println("请输入课程号：");
        Integer Cno = scanner.nextInt();
        System.out.println("请输入课程名:");
        String Cname = scanner.next();
        System.out.println("请输入学时:");
        Integer Period = scanner.nextInt();
        System.out.println("请输入学分:");
        Integer Ccriedit = scanner.nextInt();
        Course course = new Course(Cno,Cname,Period,Ccriedit);
        //调用服务层add方法
        courseService.add(course);
        System.out.println("添加成功");
    }
    public void update(Scanner scanner){
        System.out.println("请输入要修改的课程的课程号：");
        Integer Cno = scanner.nextInt();
        System.out.println("请输入修改后的课程名:");
        String Cname = scanner.next();
        System.out.println("请输入修改后的学时:");
        Integer Period = scanner.nextInt();
        System.out.println("请输入修改后的学分:");
        Integer Ccriedit = scanner.nextInt();
        Course course = new Course(Cno,Cname,Period,Ccriedit);
        //调用服务层update方法
        courseService.update(course);
        System.out.println("修改成功");
    }
    public void delete(Scanner scanner){
        System.out.println("请输入要删除的课程的课程号：");
        Integer cno = scanner.nextInt();

        courseService.delete(cno);
        System.out.println("删除成功");
    }
}
