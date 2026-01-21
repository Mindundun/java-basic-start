package com.example.java.array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    /*
    문제 - 합계와 평균2
    이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.
     */
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        // 배열 크기를 입력받기
        int[] numbers = new int[scan.nextInt()];

        System.out.println("5개의 정수를 입력하세요:");
        // 입력
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scan.nextInt();
        }

        // 처리
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        avg = sum / (double)numbers.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);

    }
}
