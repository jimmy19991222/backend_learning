package com.jieming.method;

public class Commandline {
    public static void main(String[] args) {
        // args.Length
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: "+args[i]);
        }
    }
}
