package com.jieming.method;

public class Concept {
    // class.object.method
    // main method
    public static void main(String[] args) {
        // main method should be simple

        // actual parameters, used for pass the method value
        int res = add(1,2);
        System.out.println(res);

        test();
    }

    // add, static makes it a class method
    // formal parameters, used for define the method
    public static int add(int a, int b){
        return a+b;
    }

    public static void test(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
        }
    }
}
