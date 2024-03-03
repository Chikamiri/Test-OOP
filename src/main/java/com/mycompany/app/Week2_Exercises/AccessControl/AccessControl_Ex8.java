package com.mycompany.app.Week2_Exercises.AccessControl;

class Connection{
    private Connection(int n){
        System.out.println("Create connection "+n);
    }
    //Creation via static method
    public static Connection makeConnection(int i){
        return new Connection(i);
    }
    public void connect(int a){
        System.out.println("Connecting to "+a);
    }
}

class Manager{
    private static int Left=0;
    private static Connection[] temp2 = new Connection[3];
    private static Manager cm;//To remove warming cm is unused

    private static void Init(){
        //Objects for array
        for(int i=0; i<3; i++)temp2[i] = Connection.makeConnection(i);
    }
    private Manager(){
        Init();
    }

    //@SuppressWarnings("unused")
    //private static Manager cm=new Manager();
    public static Connection access(){
        if(cm==null)cm=new Manager();
        
        if(Left<3){
            System.out.println("Accessing "+Left);
            return temp2[Left++];
        }
        else return null;
    }
}
public class AccessControl_Ex8{
    public static void main(String[] args) {
        for(int i=0; i<3; i++)
            //Using loop to access Connection through access()
            //method of class Manager
            //Then call connect(int a) method on each 
            //returned Connection object
            Manager.access().connect(i);
        
         //If i<4
         /*Exception in thread "main" java.lang.NullPointerException:
             *Cannot invoke "com.mycompany.app.Week2_Exercises.Connection.connect(int)" 
             because the return value of "com.mycompany.app.Week2_Exercises.Manager.access()"
             is null at com.mycompany.app.Week2_Exercises.AccessControl_Ex8.main(AccessControl_Ex8.java:38)*/  
    }
}


/*Lunch.java
public class AccessControl_Ex8 {
    void testPrivate(){
        //!Soup1 soup = new Soup1();
    }
    void testStatic(){
        Soup1 soup = Soup1.makeSoup();
    }
    void testSingleton(){
        Soup2.access().f();
    }
}

class Soup1{
    private Soup1(){}
    public static Soup1 makeSoup(){
        return new Soup1();
    }
}
class Soup2{
    private Soup2(){}
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access(){
        return ps1;
    }
    public void f(){}
}                                               */