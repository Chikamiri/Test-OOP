package com.mycompany.app.Week3_Code;

public class Polymorphism{
public static void main(String[] args) {
    Sinhvien cris=new Cris();
    Sinhvien peko=new Peko();
    cris.thongtin("Cris","moimoi");
    peko.thongtin("Peko", "limbus");
}
}
class Sinhvien{
    public void thongtin(String ten, String gaem){
        System.out.println(ten +" "+ gaem);
    }
}
class Cris extends Sinhvien{
    public void thongtin(String ten, String gaem){
        System.out.println(ten+" chơi "+gaem);
    }
}
class Peko extends Sinhvien{
    public void thongtin(String ten, String gaem){
        System.out.println(ten+" chơi "+gaem);
    }
}