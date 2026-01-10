package com.example.java.scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    /*
    Scanner - 반복 예제
    우리가 지금까지 개발한 프로그램들은 단 한 번의 결과 출력 후 종료되는 일회성 프로그램이었다.
    실제 프로그램들은 이렇게 한 번의 결과만 출력하고 종료되지 않는다. 한 번 실행하면 사용자가 프로그램을 종료할 때 까지 반복해서 실행된다.
    이제부터는 사용자의 입력을 지속해서 받아들이고, 반복해서 동작하는 프로그램을 개발해보자.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("문자열을 입력하세요. (exit : 종료) : ");
            String str = scan.nextLine();

            if (str.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열 : " + str);
        }
    }
}
