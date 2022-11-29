package com.jieming.oop;

// Object-Oriented Programming
// Organize code as a class, encapsulate data as an object
// Inheritance, Encapsulation and Polymorhism

// class is an abstract concept and object is a concrete concept.
// class is a template of object.

import java.io.IOException;

// base is a class
public class base {
    // main is a method
    public static void main(String[] args) {
        base demo = new base();
        System.out.println(demo.sayHello());

        // say is static
        Student.say();

        // sing is non-static
        Student student = new Student();
        student.sing();
    }

    /*
    modifier + return-value-type + method-name(parameter) + throws Exception{
        body;
        return;
    }
     */
    public String sayHello(){
        return "hello, world!";
    }

    // static or non-static
    public static int max(int a, int b){
        return a>b?a:b;
    }

    public void readFile(String file_name) throws IOException{

    }
}
