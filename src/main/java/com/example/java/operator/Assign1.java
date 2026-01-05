package com.example.java.operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;
        a += 3; // 8
        System.out.println("a = " + a);

        a -= 2; // 6
        System.out.println("a = " + a);

        a *= 4; // 24
        System.out.println("a = " + a);

        a /= 3; // 8
        System.out.println("a = " + a);

        a %= 5; // 3
        System.out.println("a = " + a);
    }
}
