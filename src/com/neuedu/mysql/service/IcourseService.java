package com.neuedu.mysql.service;

import com.neuedu.mysql.pojo.Course;


import java.util.List;

public interface IcourseService {
    List<Course> query();
    int add(Course course);
    int update(Course course);
    int delete(int cno);
}
