package com.example.java.loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        int endNum = 3;

        while (count <= endNum) {
            sum += count;

            System.out.println("count = " + count + " sum = " + sum);
            count++;
        }
    }
}
