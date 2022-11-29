package com.jieming.process_control;

import java.util.Scanner;

public class $01_interact {
    public static void main(String[] args) {
        // new a scanner to receive the inputs
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Receive inputs by next method: ");
//
//        // judge if there is a input string
//        if (scanner.hasNext()){
//            // use next to receive
//            String str = scanner.next();
//            System.out.println("The input is: " + str);
//        }

        System.out.println("Receive inputs by nextLine method: ");
        if (scanner.hasNextLine()){
            // use nextLine to receive
            String str = scanner.nextLine();
            System.out.println("The input is: " + str);
        }

        int i = 0;
        float f = 0.0f;

        System.out.println("Receive integer: ");

        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("Integer is: "+ i);
        } else{
            System.out.println("Not a integer input.");
        }

        System.out.println("Receive float: ");
        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("Float is: "+ f);
        } else{
            System.out.println("Not a float input.");
        }

        // IO stream class should be close, or they will take up resources.
        scanner.close();
    }
}
