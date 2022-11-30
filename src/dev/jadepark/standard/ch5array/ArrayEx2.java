package dev.jadepark.standard.ch5array;

import java.util.Arrays;

public class ArrayEx2 {

    /*
    int[] score = new int[]{ 50, 60, 70, 80, 90};
    int[] score = { 50, 60, 70, 80, 90};    //new int[] 를 생략가능


    길이가 0인 배열의 초기화
    int[] score = new int[0];
    int[] score = new int[]{};
    int[] score = {};
     */
    public static void main(String[] args) {

        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        //    int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for(int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }

        for(int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random()*10) + 1; //1~10의 값을 배열에 저장
        }

        for(int i = 0; i < iArr1.length; i++){
            System.out.print(iArr1[i]+",");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);


    }


}
