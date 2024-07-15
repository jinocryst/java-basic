package net.jinocryst.standard.ch5array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 81, 33, 100, 55, 95};

        int max = score[0]; // 배열의 첫번째 값을 최대값으로 초기화
        int min = score[0]; // 배열의 첫번째 값을 최소값으로 초기화

        for (int i = 0; i < score.length; i++) {    // 배열의 두번째 요소부터 읽기 위해서 변수 i의 값을 1로 초기화
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }

        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
