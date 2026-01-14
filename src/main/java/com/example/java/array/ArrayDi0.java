package com.example.java.array;

public class ArrayDi0 {
    public static void main(String[] args) {
        // 2 x 3 Array
        int[][] arr = new int[2][3]; // 행2, 열3

        arr[0][0] = 1; // 0행, 0열
        arr[0][1] = 2; // 0행, 1열
        arr[0][2] = 3; // 0행, 2열
        arr[1][0] = 4; // 1행, 0열
        arr[1][1] = 5; // 1행, 1열
        arr[1][2] = 6; // 1행, 2열

        System.out.println("arr[0][0] = " + arr[0][0]); // 0열 출력
        System.out.println("arr[0][1] = " + arr[0][1]); // 0열 출력
        System.out.println("arr[0][2] = " + arr[0][2]); // 0열 출력

        System.out.println("arr[1][0] = " + arr[1][0]); // 0열 출력
        System.out.println("arr[1][1] = " + arr[1][1]); // 0열 출력
        System.out.println("arr[1][2] = " + arr[1][2]); // 0열 출력
    }
}
