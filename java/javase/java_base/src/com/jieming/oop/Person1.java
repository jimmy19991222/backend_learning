package com.jieming.oop;

// In Java, every class is inherited from Object class
public class Person1 {
    // public: inherit
    // protected
    // default
    // private

    {
        System.out.println("Anonymous code blocks");
    }

    static {
        System.out.println("Static code blocks");
    }

    String name = "person1";
    int age;
    private int money = 1_000_000;

    // default method, same name as the class, called constructor
    // instantiate some default value
    // like __init__ in Python
    // new Person1 is in fact call constructor
    public Person1(){
        this.name = "Lou Jieming";
        System.out.println("Person constructor is called...");
    }

    // constructor with parameters
    // once define constructor with parameters, non-parametric should be defined explicitly
    // kind of method reloading
    public Person1(String name){
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void speak(){
        System.out.println("I am talking!");
    }

    // command + N as shortcut key to define a constructor

    // this refers to current class.

    public void print(){
        System.out.println("Print Person....");
    }
}
