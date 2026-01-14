package com.example.java.array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // int 형 변수 5개를 생성한다는 뜻

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        for (int i = 0; i < students.length; i++){
            System.out.println("student" + (i+1) +"의 점수는 " + students[i]);
        }

    }
}
