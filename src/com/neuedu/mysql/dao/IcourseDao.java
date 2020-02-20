package com.neuedu.mysql.dao;


import com.neuedu.mysql.pojo.Course;

import java.util.List;

public interface IcourseDao {
    List<Course> query();
    int add(Course course);
    int update(Course course);
    int delete(int cno);
}
