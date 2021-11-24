package com.company.employee;

public class MyException extends Exception{
    String str="Invalid index, Index out of bound Exception";
    MyException(String str1){
        str=str1;
        System.out.println(str);
    }
    public String toString(){
        return str;
    }
}
