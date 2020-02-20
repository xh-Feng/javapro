package com.neuedu.mysql.service;

import com.neuedu.mysql.dao.CourseDao;
import com.neuedu.mysql.dao.IcourseDao;
import com.neuedu.mysql.pojo.Course;

import java.util.List;

public class CourseService implements IcourseService {
    IcourseDao courseDao = new CourseDao();
    @Override
    public List<Course> query() {
        return courseDao.query();
    }

    @Override
    public int add(Course course) {
        return courseDao.add(course);
    }

    @Override
    public int update(Course course) {
        return courseDao.update(course);
    }

    @Override
    public int delete(int cno) {
        return courseDao.delete(cno);
    }
}
