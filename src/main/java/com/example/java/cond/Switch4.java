package com.example.java.cond;

public class Switch4 {
    public static void main(String[] args) {
        /*
        자바14부터 새로운 `switch` 문.
        바로 변수에 대입할 수 있음.
        기존 대비 더욱 깔끔하게 작성 가능하다.
         */
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
