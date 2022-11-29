package com.jieming.exception;

public class test{
    static void test(int a) throws MyException{
        System.out.println("the parameter is "+a);
        if (a>10){
            throw new MyException(a);
        }
    }

    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException e) {
            System.out.println("MyException=>"+e);
//            throw new RuntimeException(e);
        }
    }
}
