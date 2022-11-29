package com.jieming.base;

public class $05_operator {
    public static void main(String[] args) {
        // binary operator
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 30;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println((double)a*b);
        System.out.println((double)a/b);

        // relation operator

        a = 10;
        b = 20;
        c = 22;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a!=b);
        System.out.println(c%a);

        // unary operator ++， --
        b = a++;
        System.out.println(a);
        c = ++a;
        System.out.println(a);

        System.out.println(b);
        System.out.println(c);

        d += a;
        System.out.println(d);

        // power
        double pow = Math.pow(3, 2);
        System.out.println(pow);

        // logical operator
        // and, or, not
        boolean n = true;
        boolean m = false;

        System.out.println("a && b: "+(n&&m));
        System.out.println("a || b: "+(n||m));
        System.out.println("!(a && b): "+!(n&&m));

        // bit operator
        /*
        A = 0011 1100
        B = 0000 1101

        A&B = 0000 1100
        A|B = 0011 1101
        A^B = 0011 0001
        ~B = 1111 0010

        compute 2*8 by bit operate?
        << >> high efficiency
         */

        System.out.println(1 << 4);

        // string concatenate +
        System.out.println("" + a + b); // 1210
        System.out.println(a + b + ""); // 22

        // x ? y : z
        // if x == true: res = y; else res = z;

        int score = 80;
        String type = score < 60 ? "fail" : "pass";
        System.out.println(type);
    }
}
