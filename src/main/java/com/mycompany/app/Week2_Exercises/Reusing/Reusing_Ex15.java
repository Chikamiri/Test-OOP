package com.mycompany.app.Week2_Exercises.Reusing;
//import [foreign folder].Email
public class Reusing_Ex15 {
    public static void main(String[] args) {
        //Email John=new Email();
        Browser Chrome=new Browser();
        //John.addContact("Trump","Donald@totally-president.us")
        Chrome.newContact("DrKim", "Kim@NorthKorea.gov");
    }
}


/*public*/class Email{//Foreign file, but do it later
    public void mailAddress(String mail){}
    protected void addContact(String name, String mail){}
}

class Browser{
    public void internet(){}
    public void newContact(String name, String mail){
        //addContact(name, mail);
    }
}