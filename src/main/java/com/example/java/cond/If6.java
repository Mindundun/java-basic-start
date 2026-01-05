package com.example.java.cond;

public class If6 {
    public static void main(String[] args) {
        /*
        위의 If5의 코드 중 IF문 2개를 IF-ELSE문으로 변경한다면?
        : 아이템가격과 나이 할인 처리가 둘 중 하나만 된다
         */

        int price = 10000; // 아이템 가격
        int age = 10; // 나이
        int discount = 0;

        if (price >= 10000){
            discount += 1000;
        } else if (age <= 10) {
            discount += 1000;
        }

        System.out.println("총 할인 금액 : " + discount + "원");
    }
}