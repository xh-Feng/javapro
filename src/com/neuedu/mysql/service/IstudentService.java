package com.neuedu.mysql.service;

import com.neuedu.mysql.pojo.Student;

import java.util.List;

public interface IstudentService {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int delete(int id);
    Student queryOne(int id);
}
