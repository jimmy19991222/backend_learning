package com.jieming.process_control;

import java.util.Scanner;

public class $02_struct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input keyword: ");
        String s = scanner.nextLine();
//        // if
//
//        if (s.equals("19991222")){
//            System.out.println("Hello Jimmy!");
//        } else {
//            System.out.println("Keyword is wrong!");
//        }

        // else if
        if (s.equals("19991222")){
            System.out.println("Hello Jimmy!");
        } else if (s.equals("980409")){
            System.out.println("Hello Jennifer!");
        } else{
            System.out.println("Keyword is wrong!");
        }

        // switch
        System.out.println("Please input your grade:");
        String grade = scanner.nextLine();

        // After JDK7, expression result can be strings!
        // java -- class (bytecode file) -- decompile (IDEA)
        switch (grade){
            case "A":
                System.out.println("Great!");
                break;
            case "B":
                System.out.println("Well done!");
                break;
            case "C":
                System.out.println("Just so so!");
                break;
            default:
                System.out.println("Oh no!");
        }

        // iterations
        // while
        int sum = 0;
        int cnt = 0;

        while(cnt <= 100) {
            sum += cnt++;
        }
        System.out.println("1+2+...+100 = "+sum);

        // do...while
        do{
            sum -= --cnt;
        } while(cnt > 0);
        System.out.println(sum);

        // for
        for (int i = 0; i<=100; i++){
            sum += i;
        }
        System.out.println("1+2+...+100 = "+sum);

        // reinforced for
        // From JDK5
        int[] nums = {10, 20, 30, 40};
        for (int x: nums) {
            System.out.print(x + "\t");
        }
        System.out.println("");

        // break continue
        int i = 10;
        while(i <= 10)
        {
            i--;
            if (i == 5) break;
        }
        System.out.println("i = "+ i);

        // output prime number in [101, 150]
        outer: for (i = 101; i<=150; i++){
            for (int j = 2; j < Math.sqrt(i); j++){
                if (i % j == 0){
                    continue outer;
                }
            }
            System.out.print(i + " ");
        }

        System.out.println("End");
        scanner.close();

    }
}
