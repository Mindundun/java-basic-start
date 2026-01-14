package com.example.java.array;

public class Array1Ref1 {
    /*
    배열을 사용하려면 int[] students와 같이 배열을 선언한다.
    일반적인 변수와 차이점은 int[]처럼 타입 다음에 대괄호[] 가 들어간다는 점이다.

    배열은 동일한 자료형의 데이터만 들어갈 수 있다.

    자바는 배열을 생성할 때 그 내부값을 자동으로 초기화한다.

    new int[5]로 배열을 생성하면 배열의 크기만큼 메모리를 확보한다.
    이때, 자바는 메모리 어딘가에 있는 이 배열에 접근할 수 있는 참조값(주소)(x001)을 반환한다.
    앞서 선언한 배열 변수인 int[] students에 생성된 배열의 참조값을 보관한다.

    기본형은 선언과 동시에 사이즈가 정적으로 정해지지만, 참조형을 사용하면 이처럼 동적으로 크기가 변해서 유연성을 제공할 수 있다.
     */
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // int 형 변수 5개를 생성한다는 뜻

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 선언
        System.out.println("student1 = " + students[0]);
        System.out.println("student2 = " + students[1]);
        System.out.println("student3 = " + students[2]);
        System.out.println("student4 = " + students[3]);
        System.out.println("student5 = " + students[4]);

    }
}
