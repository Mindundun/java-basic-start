package com.example.java.scope;

public class While2_3 {
    /*
    count 변수.. 이 코드도 좋은 코드가 아님.
    해서 보통은 반복문의 경우 while 보단 for 를 사용.
     */
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
