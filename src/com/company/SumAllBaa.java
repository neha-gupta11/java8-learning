package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SumAllBaa {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> even=(a)->a%2==0;
        Predicate<Integer> odd=(a)->a%2!=0;
        Predicate<Integer> always=(a)->true;

        System.out.println(list.stream().filter(even).collect(Collectors.toList()));
        System.out.println(list.stream().filter(odd).collect(Collectors.toList()));
        System.out.println(list.stream().filter(always).collect(Collectors.toList()));
    }
}
