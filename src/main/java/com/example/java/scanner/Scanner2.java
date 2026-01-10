package com.example.java.scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요 : ");
        int num1 = scan.nextInt();

        System.out.println("두 번째 숫자를 입력하세요 : ");
        int num2 = scan.nextInt();
        
        int sum = num1 + num2;
        System.out.println("sum = " + sum);

    }
}
