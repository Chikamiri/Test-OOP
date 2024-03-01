package com.mycompany.app.Week1_Exercises;
//I know I can return values by using array, but I want to mess up a bit :P

public class Ex6 {
    static final class temp{
        private final int value1;
        private final int value2;
    
        public temp(int testval, int target){
            this.value1 = testval;
            this.value2 = target;
        }
    
        public int gettest1(){
            return value1;
        }
    
        public int gettest2(){
            return value2;
        }
    }

    public static temp something(int testvalue, int target, int begin, int end){
        int value1, value2;

        if(testvalue>target)value1=1;
        else if(testvalue<target)value1=-1;
        else value1=0;
        
        if(testvalue>=begin){
            if(testvalue<=end)value2=1;
            else value2=0;
        }
        else value2=0;
        return new temp(value1, value2);
    }

    /*
    static int test(int testval, int target){
        if(testval>target)return +1;
        else if(testval<target)return -1;
        else return 0;
    }*/

    public static void fuu6(){
        /* 
        System.out.println(test(10,5));
        System.out.println((test(5,10)));
        System.out.println(test(5,5));
        */
        //[Testvalue, target, begin, end]
        temp result = something(4,5,1,9);
        System.out.println(result.gettest1() +" \n "+ result.gettest2());
    }
}
