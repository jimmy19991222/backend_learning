package com.jieming.base;

public class $02_data_type_extension {
    public static void main(String[] args) {
        // integer extension
        // Binary:0b Decimal Octal: 0 Hexadecimal: 0x

        int i1 = 10; // Decimal
        int i2 = 010; // Octal
        int i3 = 0b10; // Binary
        int i4 = 0x10; // Hexadecimal, 0-9, a-f

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println("====================");

        // float extension
        // float double may be potentially flawed: limited and discrete, round-off error
        // bank business? How to represent money?
        // use BigDecimal class

        float f = 0.1f;
        double d = 1.0/10;

        System.out.println(f==d);

        float d1 = 2313131313131313f;
        float d2 = d1 + 1;
        System.out.println(d1==d2); // true
        System.out.println("====================");

        // char extension
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);

        // char are actually numbers
        // encode Unicode 2 Byte 65536
        // 97 = a, 65 = A

        // this is not an ASCII code, ASCII code has only 1 Byte, 127

        // Unicode range: U0000 - UFFFF

        char c3 = '\u0061'; // Hexadecimal

        System.out.println(c3);

        // escape character
        System.out.println("Hello\tworld!");
        System.out.println("====================");

        String sa = new String("Hello World!");
        String sb = new String("Hello World!");
        System.out.println(sa == sb); // false

        String sc = "Hello World!";
        String sd = "Hello World!";
        System.out.println(sc == sd); // true
        // object: analyse from memory
        System.out.println("====================");

        // boolean extension
        boolean flag = true;
        if (flag){}
        // Less is More! Coding should be simple!
    }
}
