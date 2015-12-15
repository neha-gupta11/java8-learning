package com.company.lambdas;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        System.out.println(list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));
        System.out.println(list.stream().filter(e -> e>5).collect(Collectors.summingInt((Integer x) -> x)));
        System.out.println(list.stream());
    }
}
