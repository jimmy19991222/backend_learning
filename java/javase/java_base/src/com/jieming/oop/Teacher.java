package com.jieming.oop;

public class Teacher extends Person1{
//    Person1 person;
    private String name;

    public Teacher(){
        // super();
        // father class is implicit called.
        System.out.println("Teacher constructor is called....");
    }

    public void eat(){
        System.out.println("Eat...");
    }
    public void print(){
        System.out.println("Teacher print....");
    }

    // private can not be inherited.
    public void test_print(){
        print();
        this.print();
        super.print();
    }

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
