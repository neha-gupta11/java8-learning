package com.knowledgesharing;


import java.util.Arrays;
import java.util.List;


//How do you print access the item in the list
public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 5);

        for(int i=0;i<list.size();i++){
            Integer x= list.get(i);
            x= x + 5;
            System.out.println(x);
        }

        list.forEach(x -> {
            x = x + 5;
            System.out.println(x);
        });

    }
}
