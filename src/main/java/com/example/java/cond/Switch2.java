package com.example.java.cond;

public class Switch2 {
    public static void main(String[] args) {
        /*
        위의 Switch1 에 작성한 IF조건문을 Switch문으로 변경
         */
        int grade = 2;

        int coupon = 0;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
