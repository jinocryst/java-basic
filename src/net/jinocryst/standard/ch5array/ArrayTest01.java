package net.jinocryst.standard.ch5array;

import java.util.Arrays;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = {3};
        String[] clear = new String[3];
        Arrays.fill(clear, "N");
        for (int i : arr) {
            clear[i-1] = "Y";
        }
        System.out.println(Arrays.toString(clear));
    }
}
