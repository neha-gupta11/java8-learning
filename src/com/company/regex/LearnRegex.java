package com.company.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {

    public static void main(String[] args) {
//        printResults(Pattern.compile("(\\w)+(\\s\\w+)*").matcher("aseem has something        "));
//        printResults(Pattern.compile("(\\w)+(\\s\\w+)*").matcher("                       kirti has something        "));
        printResults(Pattern.compile("\\b\\S+\\b").matcher("                       kirti has something        "));
//        printResults(Pattern.compile("((\\(\\d{3}\\))|\\d{3})(-|\\s)?\\d{3}\2?\\d{4}").matcher("                       kirti has something        "));
    }

    static void printResults(Matcher matcher) {
        while (matcher.find()) {
            System.out.println("||" + matcher.group() + "||");
        }
    }

}
