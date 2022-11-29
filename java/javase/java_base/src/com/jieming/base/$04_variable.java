package com.jieming.base;

public class $04_variable {
    // class variable, should have a static before
    // modifier, order independent
    static double salary = 2500;
    static final double PI = 3.14;

    // instance variable, belong to class, no need to initial.
    // default: 0, 0.0, false or null
    String name;
    int age;

    // main method
    public static void main(String[] args) {
        // type varName [=value] [{, varName[=value]}];
//        int a,b,c;
//        int a=1, b=2, c=3;

        // local variable: must declare and initial the variable
        String name = "Lou Jieming";
        char x = 'X';
        double pi = 3.14;

        $04_variable demo = new $04_variable();
        System.out.println(demo.name);
        System.out.println(demo.age);

        // a class variable, able to output directly
        System.out.println(salary);
    }

    public void add(){

    }
}
