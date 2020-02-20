package com.neuedu.mysql.dao;

import com.neuedu.mysql.pojo.Course;
import com.neuedu.mysql.util.JdbcUtil;

import java.util.List;

public class CourseDao implements IcourseDao {
    @Override
    public List<Course> query() {
        return JdbcUtil.executeQuery("select Cno,Cname,Period,Ccriedit from course",Course.class);
    }

    @Override
    public int add(Course course) {
        return JdbcUtil.executeUpdate("insert into course(Cno,Cname,Period,Ccriedit) values(?,?,?,?)",
                course.getCno(),course.getCname(),course.getPeriod(),course.getCcriedit());
    }

    @Override
    public int update(Course course) {
        return JdbcUtil.executeUpdate("update student set Cname=?,Period=?,Ccriedit=? where Cno=?",
                course.getCname(),course.getPeriod(),course.getCcriedit(),course.getCno());
    }

    @Override
    public int delete(int cno) {
        return JdbcUtil.executeUpdate("delete from student where Cno=?",cno);
    }
}
