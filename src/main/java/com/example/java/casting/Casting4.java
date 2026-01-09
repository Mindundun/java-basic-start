package com.example.java.casting;

public class Casting4 {
    /*
    자바에서 계산은 아래의 2가지를 기억하자.
    1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
    2. 서로 다른 타입의 계산은 큰범위로 자동 형변환이 일어난다.
     */
    public static void main(String[] args) {
        int div1 = 3 / 2; // 1.5
        System.out.println("div1 = " + div1);   // 1 출력

        double div2 = 3 / 2; // 1.5
        System.out.println("div2 = " + div2);   // 1.0 출력

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3);   // 1.5 출력

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);   // 1.5 출력
    }
}
