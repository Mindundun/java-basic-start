package com.example.java.array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2 x 3 array
        int[][] arr = new int[2][3];

        int i = 1;

        // 순서대로 1씩 증가하는 값을 입력
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                arr[row][column] = i++;
            }
        }

        // 2차원 배열의 길이를 활용
        for (int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                System.out.println("arr[" + row + "][" + column+ "] = " + arr[row][column]);
            }
        }
    }
}
