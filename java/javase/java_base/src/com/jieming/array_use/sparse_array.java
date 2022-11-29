package com.jieming.array_use;

public class sparse_array {
    public static void main(String[] args) {
        // column row value
        // create a 2-dimensional array 11*11, 0: none, 1: black, 0: white

        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;
        array1[4][2] = 12;
        array1[3][0] = 220;

        System.out.println("original array:");

        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        System.out.println("===========================");

        // transfer to sparse array
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array1[i][j]!=0){
                    sum++;
                }
            }
        }

        int[][] array2 = new int[sum+1][3];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;

        int cnt = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j]!=0){
                    cnt ++;
                    array2[cnt][0] = i;
                    array2[cnt][1] = j;
                    array2[cnt][2] = array1[i][j];
                }
            }
        }

        // output
        for (int i = 0; i < array2.length; i++) {
            System.out.println(
                    array2[i][0] + "\t"
                    + array2[i][1] +"\t"
                    + array2[i][2] + "\t"
            );
        }
        System.out.println("===========================");

        // recover
        System.out.println("recovery array");
        int[][] array3 = new int[array2[0][0]][array2[0][1]];

        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }

        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }

    }
}
