package com.company.functional.programming2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ImperativeLearning {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("this is something","this is the list","am still trying on list");
        System.out.println(doIt1(words));
        System.out.println(doIt2(words));
    }

    private static String doIt1(List<String> words){
        StringBuilder stringBuilder=new StringBuilder();
        Set<Character> characters=new HashSet<Character>();
        for (String word:words){
            for (char character:word.toCharArray()){
                if(!characters.contains(character)){
                    stringBuilder.append(character);
                    characters.add(character);
                }
            }
        }
        return stringBuilder.toString();
    }

    private static String doIt2(List<String> words) {
        return words.stream()
                .map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.joining());
    }


}
