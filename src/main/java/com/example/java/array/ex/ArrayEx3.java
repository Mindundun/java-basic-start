package com.example.java.array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    /*
    문제 - 배열과 역순 출력
    사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력받은 순서의 반대인 역순으로 출력하자.
    출력시 출력 포멧은 5, 4, 3, 2, 1과 같이 `,` 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];

        // 사용자에게 입력받기 위함
        System.out.println("5개의 정수를 입력하세요 :");
        Scanner scan = new Scanner(System.in);

        // 입력받은 값을 저장하기
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        // 배열의 값을 역으로 출력하기
        System.out.println("입력한 정수를 역순으로 출력 : ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[numbers.length - i  - 1]);
            if (i != numbers.length -1){
                System.out.print(", ");
            }
        }

    }
}
