package com.neuedu.mysql.pojo;

public class Course {
    private Integer Cno;
    private String Cname;
    private Integer Period;
    private Integer Ccriedit;

    public Course() {
    }

    public Course(String cname, Integer period, Integer ccriedit) {
        Cname = cname;
        Period = period;
        Ccriedit = ccriedit;
    }

    public Course(Integer cno, String cname, Integer period, Integer ccriedit) {
        Cno = cno;
        Cname = cname;
        Period = period;
        Ccriedit = ccriedit;
    }

    public Integer getCno() {
        return Cno;
    }

    public void setCno(Integer cno) {
        Cno = cno;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public Integer getPeriod() {
        return Period;
    }

    public void setPeriod(Integer period) {
        Period = period;
    }

    public Integer getCcriedit() {
        return Ccriedit;
    }

    public void setCcriedit(Integer ccriedit) {
        Ccriedit = ccriedit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Cno=" + Cno +
                ", Cname='" + Cname + '\'' +
                ", Period=" + Period +
                ", Ccriedit=" + Ccriedit +
                '}';
    }
}
