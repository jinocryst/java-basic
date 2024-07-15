package net.jinocryst.standard.ch2variable;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch;

        System.out.printf("%c=%d(%#X)%n", ch, code, code);  //A=65(0X41)

        char hch =  '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch); //가=44032(0XAC00)

        /*
        1) 인코딩과 디코딩
        인코딩 : 문자를 코드로 변환하는 것
        디코딩 : 코드를 문자로 변환하는 것

        2) ASCII (American Standard Code for Information Interchange : 정보교환을 위한 미국 표준 코드)
         */
    }
}
