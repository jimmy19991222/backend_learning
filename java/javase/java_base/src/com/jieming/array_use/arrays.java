package com.jieming.array_use;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 90, 2020, 102, 320, 1222};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
//        printArray(a);

        Arrays.fill(a, 2,4,0);
        System.out.println(Arrays.toString(a));
    }

    public static void printArray(int[] a){
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length-1){
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
