package com.company.lambda2;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 5);

        list.forEach(x -> {
            x = x + 5;
            System.out.println(x);
        });

        List<String> cities=Arrays.asList("toronto","Denver","Zurich");
        cities.stream()
                .forEach(x -> {
                    x = x + 5;
                    System.out.println(x);
                });

        Optional<String> any=cities.stream().findAny();         //returns us first possible match.
        System.out.println(any.get());
    }
}
