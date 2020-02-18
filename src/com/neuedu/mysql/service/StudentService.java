package com.neuedu.mysql.service;

import com.neuedu.mysql.dao.IstudentDao;
import com.neuedu.mysql.dao.StudentDao;
import com.neuedu.mysql.pojo.Student;

import java.util.List;

public class StudentService implements IstudentService {
    IstudentDao studentDao = new StudentDao();
    @Override
    public List<Student> query() {
        return studentDao.query();
    }

    @Override
    public int add(Student student) {
        return 0;
    }

    @Override
    public int update(Student student) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
