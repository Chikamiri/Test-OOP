package com.mycompany.app.Tuan2_Code1;

public class Book {
    String title;
    String author;
    int numPages;

    public Book(String t, String a, int p){
        title=t;
        author=a;
        numPages=p;
    }

    public static void main(String[]args){
        Book myObject=new Book("a","b",2);
        System.out.println(myObject.title);
    }
}
