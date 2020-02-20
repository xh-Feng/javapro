package com.neuedu.mysql.pojo;

public class SC {
    private Integer Sno;
    private Integer Cno;
    private Integer Geade;

    public SC() {
    }

    public SC(Integer geade) {
        Geade = geade;
    }

    public SC(Integer sno, Integer cno, Integer geade) {
        Sno = sno;
        Cno = cno;
        Geade = geade;
    }

    public Integer getSno() {
        return Sno;
    }

    public void setSno(Integer sno) {
        Sno = sno;
    }

    public Integer getCno() {
        return Cno;
    }

    public void setCno(Integer cno) {
        Cno = cno;
    }

    public Integer getGeade() {
        return Geade;
    }

    public void setGeade(Integer geade) {
        Geade = geade;
    }

    @Override
    public String toString() {
        return "SC{" +
                "Sno=" + Sno +
                ", Cno=" + Cno +
                ", Geade=" + Geade +
                '}';
    }
}
