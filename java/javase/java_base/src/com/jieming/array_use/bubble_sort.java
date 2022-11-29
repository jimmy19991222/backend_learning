package com.jieming.array_use;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4,23, 43, 2323, 0, -1};
        System.out.println(Arrays.toString(sort(a)));
    }

    public static int[] sort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; i+j < a.length-1; j++){
                if (a[j] > a[j+1]){
                    int c = a[j];
                    a[j] = a[j+1];
                    a[j+1] = c;
                }
            }
        }
        return a;
    }
}
