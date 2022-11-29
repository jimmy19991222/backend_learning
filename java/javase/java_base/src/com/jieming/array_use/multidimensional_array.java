package com.jieming.array_use;

public class multidimensional_array {
    public static void main(String[] args) {
        int[][] array = {{1,2}, {2,3,4}, {1,2,3,4}};
        printArray(array[0]);

        System.out.println(array[2][3]);
    }

    // print array elements
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + "\t");
        }
        System.out.println();
    }
}
