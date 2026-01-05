package com.example.java.cond;

public class Switch3 {
    public static void main(String[] args) {
        /*
        위의 Switch2 에 작성한 Switch문에서 break 주석처리 한다면?
        : 가장 마지막의 쿠폰금액으로 출력된다.
         */
        int grade = 2;

        int coupon = 0;

        switch (grade) {
            case 1:
                coupon = 1000;
//                break;
            case 2:
                coupon = 2000;
//                break;
            case 3:
                coupon = 3000;
//                break;
            default:
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
