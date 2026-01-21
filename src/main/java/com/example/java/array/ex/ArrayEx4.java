package com.example.java.array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    /*
    문제 - 합계와 평균
    사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자.
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;
        double avg = 0.0;

        // 입력받기
        System.out.println("5개의 정수를 입력하세요:");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scan.nextInt();
        }

        // 합계구하기
        for(int number: numbers){
            sum += number;
        }

        avg = sum / (double)numbers.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
