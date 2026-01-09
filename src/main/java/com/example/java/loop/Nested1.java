package com.example.java.loop;

public class Nested1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.println("i = " + i);
            for (int j = 1; j <= 2; j++) {
                System.out.println("j = " + j);
            }
        }
    }
}
