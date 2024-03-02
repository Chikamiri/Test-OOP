package com.mycompany.app.Week2_Exercises;

/*
//Let's just say I have subfolder Week2_Exercises_outer
       and the file name is Ex9_alien.java
import [com. something that I'm too lazy to type in
        but instead I type this].Week2_Exercises.*

public class Ex9_alien{
    public static void main(String[]args){
        AccessControl_Ex9 pc=new AccessControl_Ex9();
    }
    //If I imported [bla bla].Week2_Exercises.*
        the code should run normally without error.
}
*/

public class AccessControl_Ex9 {
    public AccessControl_Ex9(){
        System.out.println("Creating a packaged class");
    }
}


/*
//access/local/PackagedClass.java
package access.local;
class PackagedClass{
    public PackagedClass(){
        System.out.println("Creating a packaged class");
    }
}

//access/foreign/Foreign.java
package access.foreign;
import access.local.*;
public class Foreign{
    public static void main(String[] args) {
        PackagedClass pc = new PackagedClass()
    }
}
*/



