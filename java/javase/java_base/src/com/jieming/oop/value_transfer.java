package com.jieming.oop;

public class value_transfer {
    public static void main(String[] args) {
        // Pass by reference
        Person person = new Person();
        change(person);
        System.out.println(person.name); // Lou Jieming

        // Pass by value
        String str = null;
        change(str);
        System.out.println(str);

        int a = 1;
        change(a, 10);
        System.out.println(a); // 1
    }

    public static void change(Person person){
        person.name = "Lou Jieming";
    }

    public static void change(String str){
        str = "Lou Jieming";
    }
    public static void change(int a, int value){
        a = value;
    }
}

class Person{
    String name;
}
