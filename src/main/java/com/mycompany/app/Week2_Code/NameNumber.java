package com.mycompany.app.Week2_Code;

public class NameNumber {
    private String Lastname;
    private String telNumber;

    public NameNumber(){}
    public NameNumber(String name, String num){
        Lastname=name;
        telNumber=num;
    }

    public String getLastname(){
        return Lastname;
    }
    public String gettelNumber(){
        return telNumber;
    }
}