package com.neuedu.zuoye0212;

import java.io.Serializable;

public class MyBook2 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Double price;
    private String press;
    private String author;
    private String bookISBN;
    public MyBook2(){

    }
    public MyBook2(String name, Double price, String press, String author, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
        this.bookISBN = bookISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    @Override
    public String toString() {
        return "MyBook2{" +
                "name:" + name + '\'' +
                ", price:" + price +
                ", press:'" + press + '\'' +
                ", author:'" + author + '\'' +
                ", bookISBN:'" + bookISBN + '\'' +
                '}';
    }
}
