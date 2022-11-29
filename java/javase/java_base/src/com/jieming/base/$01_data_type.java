package com.jieming.base;

public class $01_data_type {
    public static void main(String[] args) {
        /*
            data type:
            * primitive type:
                * byte 2B:8/ short 4B:16/ int 4B = 32/ long 8B = 64
                * float/ double
                * char
                * boolean
            * reference type
                * class
                * api
                * array

             1 Byte/ 1B = 8 bit
             1KB = 1024B
             1MB = 1024B
             1GB = 1024MB
             1TB = 1024GB
         */

        String name = "Lou Jieming";
        int num = 10;
        // byte num2 = 200; byte(-127, 128)
        long num3 = 10L; // Long should have a L behind

        float num4 = 50.1F; // float should have a F behind
        double num5 = 3.1415926;

        char name1 = 'A';
        String name2 = ""; // String is a class, not identifier

        boolean flag = true;

        System.out.println(num);
        System.out.println("My name: " + name);
    }
}

