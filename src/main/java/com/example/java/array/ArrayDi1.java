package com.example.java.array;

public class ArrayDi1 {
    public static void main(String[] args) {
        // 2x3 array
        int[][] arr = new int[2][3];

        arr[0][0] = 1; // 0행, 0열
        arr[0][1] = 2; // 0행, 1열
        arr[0][2] = 3; // 0행, 2열
        arr[1][0] = 4; // 1행, 0열
        arr[1][1] = 5; // 1행, 1열
        arr[1][2] = 6; // 1행, 2열


        for(int i = 0; i < 2; i++){
            System.out.println("arr["+i+"][0] = " + arr[i][0]);
            System.out.println("arr["+i+"][1] = " + arr[i][1]);
            System.out.println("arr["+i+"][2] = " + arr[i][2]);
        }
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                System.out.println("arr["+i+"]["+j+"] =" + arr[i][j]);
//            }
//        }
    }
}
