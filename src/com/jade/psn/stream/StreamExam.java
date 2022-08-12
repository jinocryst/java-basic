package com.jade.psn.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Melon", "Grape", "Strawberry"));
        System.out.println("list = "+ list);

        //map
        list.stream().map(s -> s.toUpperCase());
        list.stream().map(String::toUpperCase);

        System.out.println(list.stream().map(s -> s.toUpperCase()).collect(Collectors.joining(" ")));
        //APPLE BANANA MELON GRAPE STRAWBERRY

        System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.joining()));

        System.out.println(list.stream().map(s -> s.toUpperCase()).collect(Collectors.joining()));

        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));


        //filter length가 5 이상인 것 필터링
        System.out.println(list.stream().filter(s -> s.length() > 5).collect(Collectors.joining(" ")));

        System.out.println(list.stream().filter(s -> s.length() > 5).collect(Collectors.toList()));

        //sorted
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
    }



}
