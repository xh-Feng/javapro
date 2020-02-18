package com.neuedu.mysql.web;

import com.neuedu.mysql.pojo.Student;
import com.neuedu.mysql.service.IstudentService;
import com.neuedu.mysql.service.StudentService;

import java.util.List;

public class StudentWeb {
    IstudentService studentService = new StudentService();

    public void query(){
        List<Student> list = studentService.query();
        for (Student student:list)
            System.out.println(student);
    }
}
