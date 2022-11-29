package com.jieming.array_use;

public class concept {
    public static void main(String[] args) {
        // static initialization
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();

        for (int i : a) {
            System.out.print(i + "\t");
        }
        System.out.println();

        // dynamic initialization
        int[] nums = new int[10];
        // implicit value assignment
        // default 0 or null
        nums[0] = 1;
        nums[9] = 10;
        System.out.println(nums.length);
        System.out.println(nums[9]);

        // memory analyse
        // heap, stack
        // array -> stack
        // new int[10] -> heap in memory
        // value assignment -> heap in memory


    }
}
