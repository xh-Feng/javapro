package com.neuedu.mysql.util;

import com.neuedu.mysql.test.MyTestShow;

import java.util.Scanner;

public class WebUtil {
    public void menu(String string){
        System.out.println("***"+string+"***************");
        System.out.println("**1—————————查询所有**");
        System.out.println("**2—————————————添加**");
        System.out.println("**3—————————————修改**");
        System.out.println("**4—————————————删除**");
        System.out.println("**5—————————查询菜单**");
        System.out.println("**6———————————主菜单**");
        System.out.println("**7—————————————退出**");
        System.out.println("**********************");
    }
}
