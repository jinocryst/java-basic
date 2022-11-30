package dev.jadepark.standard.ch5array;

public class ArrayEx1 {

    public static void main(String[] args) {
        /*
        배열(Array) : 같은 타입의 변수를 하나의 묶음으로 다루는 것
        int score1, score2, score3 ...
        int[] score = new int[5];
        score는 배열을 다루는데 필요한 참조변수일 뿐 값을 저장하기 위한 공간은 아니다.

        배열의 생성
        타입[] 변수이름;  //배열을 선언(배열을 다루기 위한 참조변수 선언)
        변수이름 = new 타입[길이];  //배열을 생성(실제 저장공간을 생성)

        int[] score;
        score = new int[5];

        배열의 길이와 인덱스
        배열의 요소(element) : 생성된 배열의 각 저장공간
        인덱스(index) : 배열의 요소마다 붙여진 일련번호

        "인덱스(index)의 범위는 0부터 배열길이-1 까지"

        배열의 인덱스로 상수 대신 변수나 수식도 사용할 수 있는 것이 장점이다. -> 반복문 사용
         */

        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k+2] + score[4];

        for(int i=0; i<5; i++) {
            System.out.printf("score[%d]:%d%n",i, score[i]);
        }

        System.out.printf("tmp:%d%n", tmp);

        System.out.printf("socre[%d]:%d%n", 7, score[7]);

    }

    /*
    배열의 길이가 0인 배열도 생성가능하다.
    때때로 프로그래밍에서 유용하게 사용될 수 있다.

    배열의 길이를 변경하는 방법:
    1. 더 큰 배열을 새로 생성한다.
    2. 기존 배열의 내용을 새로운 배열에 복사한다.ㅂ

     */

}
