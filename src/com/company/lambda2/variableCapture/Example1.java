package com.company.lambda2.variableCapture;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        int var=10;
        list.forEach((x)-> System.out.println(x+var));

        String str="some string ";
        Function<String,String> function1=x-> x.toUpperCase();
        Function<String,String> function2=String::toUpperCase;

        function1.apply(str);
//        Function<String,String> function3=str::toUpperCase;
    }
}
