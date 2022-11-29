package com.jieming.exception;

// self-defined exception
public class MyException extends Exception{
    // transfer a number n
    // if n > 10 throw a exception

    private int detail;

    public MyException(int a){
        this.detail = a;
    }

    @Override
    public String toString() {
        return "MyException{"+detail+"}";
    }
}
