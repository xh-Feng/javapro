package com.neuedu.mysql.test;

import com.neuedu.mysql.web.StudentWeb;

public class MyTestShow {
    public static void main(String[] args) {
        StudentWeb studentWeb = new StudentWeb();
        studentWeb.query();
    }
}
