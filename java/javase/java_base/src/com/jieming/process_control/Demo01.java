package com.jieming.process_control;

import java.util.Scanner;

// input multiple numbers, output the sum and mean.
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input multiple numbers:");
        double sum = 0;
        int cnt = 0;

        while(scanner.hasNextDouble()){
            double cur = scanner.nextDouble();
            cnt ++;
            sum += cur;
        }

        System.out.println("Count is: " + cnt);
        System.out.println("Sum is: " + sum);
        System.out.println("Mean is: " + sum/cnt);

        scanner.close();
    }
}
