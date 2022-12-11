package dev.jadepark.personal.randomcode;

import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        Random random = new Random();
        String authKey = String.valueOf(random.nextInt(888888) + 111111); //범위 : 111111 ~ 999999
        System.out.println("authKey:"+authKey);
    }
}
