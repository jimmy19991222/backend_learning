package com.jieming.method;

public class Variadic {
    public static void main(String[] args) {
        Variadic demo = new Variadic();
        demo.test(1,2,3,4,5);
        demo.test(new double[]{1,2,3,4,5});
    }

    public void test(double ...i){
        for (double x: i){
            System.out.print(x + "\t");
        }
        System.out.println();
    }
}
