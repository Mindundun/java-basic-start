package com.example.java.array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2x3 array
        int[][] arr =  {{1, 2, 3}, {4, 5, 6}};


        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("arr["+i+"]["+j+"] =" + arr[i][j]);
            }
        }
    }
}
