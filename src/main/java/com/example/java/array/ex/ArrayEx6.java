package com.example.java.array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    /*
    문제 - 가장 작은 수, 큰 수 찾기
    사용자로부터 n개의 정수를 입력받아 배열에 저장한 후,
    배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램을 작성하자.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 사용자로부터 입력받을 갯수 받기
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int num = scan.nextInt();
        int[] numbers = new int[num];

        System.out.println(num + "개의 정수를 입력하세요:");

        // 배열에 입력 받기
        for(int i = 0; i < num; i++){
            numbers[i] = scan.nextInt();
        }

        int minNumber = numbers[0];
        int maxNumber = numbers[0];

        for(int i = 0; i < num; i++){
            if(minNumber > numbers[i]) {
                minNumber = numbers[i];
            }
            if(maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수:  " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
