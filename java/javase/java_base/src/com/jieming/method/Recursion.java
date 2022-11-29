package com.jieming.method;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(f(4));
    }

    // stack mechanism
    // stack can overflow, use only when the stack is shallow
    public static int f(int n){
        if (n == 1) return 1;
        return n * f(n-1);
    }
}
