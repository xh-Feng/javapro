package com.neuedu.zuoye0210;

import java.util.ArrayList;
import java.util.Scanner;

/*class mybook{
    String name;
    Double price;
    String press;
    String author;
    String bookISBN;
}*/

public class MyBook {
    private String name;
    private Double price;
    private String press;
    private String author;
    private String bookISBN;
    public ArrayList books;
    /*mybook[] books=new mybook[200];*/

   /* ArrayList<mybook> mybooks = new ArrayList();*/

    /*public ArrayList mybook(){
        return mybook();
    }*/
    //inputData(ArrayList<MyBook> books])，n为书的数量，从键盘上输入n本书的信息

    public ArrayList inputData(ArrayList<MyBook> books, Integer n){
        Scanner scanner = new Scanner(System.in);
        MyBook myBook = new MyBook();
        for (int i = 0; i < n; i++){
            System.out.println("请按以下顺序输入信息：书名、价格、出版社、作者、书的ISBN号");
            myBook.name = scanner.next();
            myBook.price =  Double.valueOf(scanner.next());
            myBook.press = scanner.next();
            myBook.author = scanner.next();
            myBook.bookISBN = scanner.next();
            books.add(myBook);
        }
        return books;

    }

    //编写一个函数print(ArrayList<MyBook> books)，输出全部书的信息。
    public void print(ArrayList<MyBook> books){
        for(MyBook book : books){
            System.out.println("书名："+book.name+"\n价格："+book.price+"\n出版社："+book.press+"\n作者："+
                    book.author+"\nISBN："+book.bookISBN);
        }
    }

    //增加查找功能，编写函数searchName(ArrayList<MyBook> books,String name)，
    //根据书名name在数组books中查找是否存在此书，如果能找到，输出该书的详细信息，如果找不到，输出“此书不存在”。
    public void searchName(ArrayList<MyBook> books, String name){
        for (MyBook book : books){
            if (book.name.equals(name)){
                System.out.println("书名："+book.name);
                System.out.println("价格："+book.price);
                System.out.println("出版社："+book.press);
                System.out.println("作者："+book.author);
                System.out.println("ISBN："+book.bookISBN);
                return;
            }
        }
        System.out.println("此书不存在");

    }

    //增加删除功能，编写函数(ArrayList<MyBook> books,String name)，
    //根据书名name在数组books中查找是否存在此书，如果存在，删除该书，并提示“此书删除成功。”，并显示该书的详细信息。
    //如果不存在，输出“没有此书，删除失败.”
    public void deleteName(ArrayList<MyBook> books, String name){
        Integer flag = 1;
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).name.equals(name)){
                System.out.println("书名："+books.get(i).name);
                System.out.println("价格："+books.get(i).price);
                System.out.println("出版社："+books.get(i).press);
                System.out.println("作者："+books.get(i).author);
                System.out.println("ISBN："+books.get(i).bookISBN);
                books.remove(i);
                System.out.println("此书删除成功。\n");
                return;
            }
        }
        if (flag==1){
            System.out.println("没有此书，删除失败");
        }
    }

    //添加函数menu()，输出菜单项请选择你要进行的操作（请输入1-4中的任一个数字）：
    // 1：添加图书2：删除图书3：查找图书（根据用户名）4：退出当用户
    //输入1-3时，分别调用输入、删除和查找函数，当用户输入4时程序结束。
    public void menu() {
        MyBook myBook = new MyBook();
        myBook.books = new ArrayList();
        int flag = 0;
        Scanner s = new Scanner(System.in);
        while (flag == 0) {
            System.out.println("请输入1-4中的任一个数字\n1：添加图书\n2：删除图书\n3：查找图书(根据书名)\n4：退出当用户");
            int a = s.nextInt();
            if (a == 1) {
                System.out.println("添加图书：\n请输入要添加的图书的本数\n还有错 只能一次性添加 再次选择会覆盖之前的添加");
                int n = s.nextInt();
                inputData(myBook.books, n);
            } else if (a == 2) {
                System.out.println("删除图书：\n请输入要删除的名字");
                String name = s.next();
                deleteName(myBook.books, name);
            } else if (a == 3) {
                System.out.println("查找图书(根据书名)：\n请输入要查找的图书名");
                String name = s.next();
                searchName(myBook.books, name);
            } else if (a == 4) {
                System.exit(0);
            } else {
                flag = 1;
            }
        }
    }
}
