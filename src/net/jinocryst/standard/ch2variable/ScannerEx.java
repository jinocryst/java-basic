package net.jinocryst.standard.ch2variable;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두자리 정수를 입력하세요.>");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : "+input);
        System.out.printf("num=%d%n", num);
    }
}
