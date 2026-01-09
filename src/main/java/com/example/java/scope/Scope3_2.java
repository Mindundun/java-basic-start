package com.example.java.scope;

public class Scope3_2 {
    /*
    아래의 코드는 temp변수는 if문 안에서만 처리된다.
     */
    public static void main(String[] args) {
        int m = 10;

        if ( m > 0 ) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        // System.out.println("temp = " + temp); // 오류, 스코프 밖임.
        System.out.println("m = " + m);
    }
}
