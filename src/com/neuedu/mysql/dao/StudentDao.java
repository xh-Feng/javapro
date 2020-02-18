package com.neuedu.mysql.dao;

import com.mysql.jdbc.Driver;
import com.neuedu.mysql.pojo.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements IstudentDao {
    String url="jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=utf8";
    String usename="root";
    String password="123";
    @Override
    public List<Student> query() {
        List<Student> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,usename,password);
            pstmt = con.prepareStatement("select Sno,Sname,Ssex,Sage,Sdept from student");
            // 如果是查询  调用 executeQuery方法 返回一个 ResultSet 结果集
            rs = pstmt.executeQuery();
            /*  ResultSet 每次调用 next()方法的时候 会做两件事
             *    1 看一下有没有下一行 如果没有返回fasle
             *    2 如果有 将游标推向下一行 返回true
             * */
            while(rs.next()){
                Student student = new Student();
                student.setSno(rs.getInt("Sno"));
                student.setSname(rs.getString("Sname"));
                student.setSsex(rs.getString("Ssex"));
                student.setSage(rs.getInt("Sage"));
                student.setSdept(rs.getString("Sdept"));
                list.add(student);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs!=null)
                    rs.close();
                if (pstmt!=null)
                    pstmt.close();
                if (con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
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
