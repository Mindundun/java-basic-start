package com.example.java.array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 배열 선언과 동시에 생성과 초기화


        // 변수 값 사용
        for (int i = 0; i < students.length; i++){
            System.out.println("student" + (i+1) +"의 점수는 " + students[i]);
        }
    }
}
