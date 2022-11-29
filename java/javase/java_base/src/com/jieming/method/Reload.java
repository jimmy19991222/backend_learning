package com.jieming.method;

public class Reload {
    public static void main(String[] args) {
        int max = max(10, 20);
        System.out.println(max);

        double max2 = max(10.0, 20.0);
        System.out.println(max2);
    }

    public static double max(double a, double b){
        double result = 0;

        if (a == b){
            System.out.println("num1 == num2");
            return 0;
        }

        if (a > b){
            result = a;
        } else{
            result = b;
        }
        return result;
    }

    // reload max by returning int result
    public static int max(int a, int b){
        int result = 0;

        if (a == b){
            System.out.println("num1 == num2");
            return 0;
        }

        if (a > b){
            result = a;
        } else{
            result = b;
        }
        return result;
    }
}
