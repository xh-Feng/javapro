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
        return studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int delete(int Sno) {
        return studentDao.delete(Sno);
    }

    @Override
    public Student queryOne(int Sno) {
        return null;
    }
}
