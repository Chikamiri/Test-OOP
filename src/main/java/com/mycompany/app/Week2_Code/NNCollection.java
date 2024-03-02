package com.mycompany.app.Week2_Code;

public class NNCollection{
    private NameNumber[] nnArray = new NameNumber[100];
    private int free;

    public NNCollection(){free=0;}
    public void insert(NameNumber n){
        int index =0;
        for (int i=free++; i!=0&& nnArray[i-1].getLastname().compareTo(n.getLastname())>0; i--){
            nnArray[i]=nnArray[i-1];
            index=i;
        }
        nnArray[index]=n;
    }

    public String findNumber(String IName){
        for(int i=0; i!=free; i++){
            if(nnArray[i].getLastname().equals(IName))
                return nnArray[i].gettelNumber();
        }
        return new String("Name not found");
    }
}