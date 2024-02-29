package com.mycompany.app.Week2_Code;

public class Time {
    int hour, minute, second;

    public void sethour(int h){
        if(h>=0 && h<24)hour=h;
        else System.out.println("Invalid hour!");
    }
    public void setminute(int m){
        if(m>=0 && m<60)minute=m;
        else System.out.println("Invalid minute");
    }
    public void setsecond(int s){
        if(s>=0 && s<60)second=s;
        else System.out.println("Invalid second");
    }
    public String print(){
        return hour + ":" + minute + ":" + second;
    }
}
