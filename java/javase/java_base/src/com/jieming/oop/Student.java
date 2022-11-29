package com.jieming.oop;

public class Student {
    // encapsulation often focuses on attributes, not methods.
    // Attributes
    private String name;
    private int age;
    private char sex;

    // Methods
    // get
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    // set
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0){
            this.age = 3;
        }else{
            this.name = name;
        }
    }

    // static load when the class create
    public static void say(){
        System.out.println("Students are saying.");
    }

    // non-static load when the class instantiation.
    public void sing(){
        System.out.println("Students are singing.");
    }

    public void study(){
        System.out.println(this.name + " is studying");
    }
}
