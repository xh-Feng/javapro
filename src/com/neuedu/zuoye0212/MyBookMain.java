package com.neuedu.zuoye0212;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBookMain {
    public static MyBook2[] books = new MyBook2[200];
    public static List<MyBook2> list = new ArrayList<>();
    public static File file = new File("d:/Atushu");

    public static void main(String[] args) {
        if(!file.exists()){
            inputData(list);
            save();
        }else{
            read();
        }
        menu();
    }
    public static void menu(){
        System.out.println("请输出菜单项选择你要进行的操作(请输入1-4中的任一个数字)：");
        System.out.println("1：添加图书");
        System.out.println("2：删除图书");
        System.out.println("3：查找图书(根据书名)");
        System.out.println("4：查看所有图书");
        System.out.println("5：退出");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                addBook(list);
                break;
            case 2:
                System.out.println("请输入要删除的书名");
                String name = scanner.next();
                deleteName(list,name);
                break;
            case 3:
                System.out.println("请输入要查找的书名");
                String searchName = scanner.next();
                searchName(list,searchName);
                break;
            case 4:
                print(list);
                break;
            default:
                System.exit(1);
                break;
        }
    }
    public static void inputData(List<MyBook2> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("首次运行系统，请输入初始化书籍的数量：");
        int n = scanner.nextInt();
        for (int i = 1; i<= n; i++){
            MyBook2 myBook  = new MyBook2("书名"+i,Double.valueOf(String.valueOf(i)),"出版社"+i,"作者"+i,"ISBN"+i);
            books.add(myBook);
        }
    }
    public static void print(List<MyBook2> books){
        for (int i = 0; i < books.size(); i++){
            System.out.println(books.get(i));
        }
        menu();
    }
    public static void searchName(List<MyBook2> books, String name){
        for (int i = 0; i < books.size(); i++){
            MyBook2 myBook = books.get(i);
            if (myBook.getName().equals(name)){
                System.out.println(myBook);
                menu();
                return;
            }
        }
        System.out.println("此书不存在");
        menu();
    }
    public static void deleteName(List<MyBook2> books, String name){
        for (int i = 0; i < books.size(); i++){
            MyBook2 myBook = books.get(i);
            if (myBook.getName().equals(name)){
                books.remove(i);
                System.out.println("删除成功");
                save();
                menu();
                return;
            }
        }
        System.out.println("此书不存在，删除失败");
        menu();
    }
    public static void addBook(List<MyBook2> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = scanner.next();
        System.out.println("请输入价格：");
        double price = scanner.nextDouble();
        System.out.println("请输入出版社：");
        String press = scanner.next();
        System.out.println("请输入作者：");
        String author = scanner.next();
        System.out.println("请输入书的ISBN号：");
        String bookISBN = scanner.next();
        MyBook2 myBook = new MyBook2(name,price,press,author,bookISBN);
        books.add(myBook);
        save();
        menu();

    }
    public static void save(){
        OutputStream os = null;
        ObjectOutputStream oos = null;
        try {
            os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(list);
            oos.flush();
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(oos!=null)
                    oos.close();
                if(os!=null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void read(){
        InputStream is  = null;
        ObjectInputStream ois = null;
        try {
            is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            list = (List<MyBook2>)ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ois!=null)
                    ois.close();
                if(is!=null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
