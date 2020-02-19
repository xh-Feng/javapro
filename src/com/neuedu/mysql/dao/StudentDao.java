package com.neuedu.mysql.dao;

import com.mysql.jdbc.Driver;
import com.neuedu.mysql.pojo.Student;
import com.neuedu.mysql.util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        /*int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,usename,password);
            pstmt = con.prepareStatement("insert into student(Sno,Sname,Ssex,Sage,Sdept) values(?,?,?,?,?)");
            pstmt.setInt(1,student.getSno());
            pstmt.setString(2,student.getSname());
            pstmt.setString(3,student.getSsex());
            pstmt.setInt(4,student.getSage());
            pstmt.setString(5,student.getSdept());
            i=pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt!=null)
                    pstmt.close();
                if (con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;*/
        return JdbcUtil.executeUpdate("insert into student(Sno,Sname,Ssex,Sage,Sdept) values(?,?,?,?,?)",
                student.getSno(),student.getSname(),student.getSsex(),student.getSage(),student.getSdept());
    }

    @Override
    public int update(Student student) {
        /*int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,usename,password);
            pstmt = con.prepareStatement("update student set Sname=?,Ssex=?,Sage=?,Sdept=? where Sno=?");
            pstmt.setString(1,student.getSname());
            pstmt.setString(2,student.getSsex());
            pstmt.setInt(3,student.getSage());
            pstmt.setString(4,student.getSdept());
            pstmt.setInt(5,student.getSno());
            i=pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt!=null)
                    pstmt.close();
                if (con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;*/
        return JdbcUtil.executeUpdate("update student set Sname=?,Ssex=?,Sage=?,Sdept=? where Sno=?",
                student.getSname(),student.getSsex(),student.getSage(),student.getSdept(),student.getSno());
    }

    @Override
    public int delete(int Sno) {
        /*int i = 0;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,usename,password);
            pstmt = con.prepareStatement("delete from student where Sno=?;");
            pstmt.setInt(1,Sno);
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt!=null)
                    pstmt.close();
                if (con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;*/
        return JdbcUtil.executeUpdate("delete from student where Sno=?",Sno);
    }

    @Override
    public Student queryOne(int Sno) {
        return null;
    }
}
