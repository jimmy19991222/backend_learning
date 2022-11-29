package com.jieming.base;

public class $03_type_conversion {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i; // memory overflow

        // cast
        // automatic type conversion
        // memory overflow or precision problem when type conversion
        System.out.println(i);
        System.out.println(b);
        System.out.println("====================");

        System.out.println((int)23.7); // 23
        System.out.println((int)-45.89f); //-45
        System.out.println("====================");

        char c = 'a';
        int d = c+1;
        System.out.println(d);
        System.out.println((char)d);
        System.out.println("====================");

        // operate large number, we should consider overflow problem
        // new in JDK7, numbers can be divided by underline

        int money = 1_000_000_000;
        int years = 20;
        int total = money * years; // overflow
        System.out.println(total);

        long total2 = money * years;
        System.out.println(total2); // still overflow

        long total3 = money * (long)years;
        System.out.println(total3);

        // L
    }
}
