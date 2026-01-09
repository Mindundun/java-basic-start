package com.example.java.scope;

public class Scope3_1 {
    /*
    스코프가 존재하는 이유
    아래의 코드는 좋은 코드라고 보기 어렵다.
    왜냐하면 temp변수는 if문에서만 사용하는 변수이기 때문이다.

    이와 같을 때 아래의 문제들이 발생한다.
    1. 비효율적인 메모리 사용
    2. 코드의 복잡성 증가
     */
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;

        if ( m > 0 ) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
