package com.example.java.array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    /*
    문제 - 2차원 배열2
    이전 문제에서 학생수를 입력받도록 개선하자.
     */
    public static void main(String[] args) {
        String[] subjects = {"국어", "영어", "수학"};

        Scanner scan = new Scanner(System.in);
        System.out.println("학생수를 입력하세요:");
        int n = scan.nextInt();

        // n명의 학생, 3과목
        int[][] studentsScore = new int[n][3];

        // 입력받기
        for (int i = 0; i < n; i++){
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

            for(int j=0; j<3; j++){
                System.out.print(subjects[j] + " 점수:");
                studentsScore[i][j] = scan.nextInt();
            }
        }

        // 총점 구하기
        for (int i = 0; i < n; i++){
            int total = 0;
            for (int j = 0; j < 3; j++){
                total += studentsScore[i][j];
            }
            double avg = total/3.0;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " + avg);

        }

    }
}
