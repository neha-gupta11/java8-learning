package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        greater();
        plus();
        cancatenate();
        inCapss();
        ex2Q1();
       /* int aa=20;
        {
            int aa=10;
            aa++;
            System.out.println(aa);
        }

        System.out.println(aa);*/
    }

    public static void greater(){
        System.out.println("***********Greater than *********************");
        GreaterThan greaterThan = (int a, int b) -> a > b;
        System.out.println(greaterThan.greaterThan(1, 2));
        System.out.println(greaterThan.greaterThan(5, 6));
        System.out.println(greaterThan.greaterThan(8, 6));
    }

    public static void plus(){
        System.out.println("**********************Plus One**************************");
        IncreamentBy1 plus=(int a)-> a++;
        System.out.println(plus.plusOne(2));
        System.out.println(plus.plusOne(6));
        System.out.println(plus.plusOne(8));
        System.out.println(plus.plusOne(15));
    }

    public static void cancatenate() {
        System.out.println("**********************Concatenate****************************");
        ConcatenateTwoStrings twoStrings=(String a, String b)-> a+b;
        System.out.println(twoStrings.concatenate("Hello", " world"));
        System.out.println(twoStrings.concatenate("Neha ", " Here"));
        System.out.println(twoStrings.concatenate("Java ", " 8"));
    }

    public static void inCapss(){
        System.out.println("*****************In caps*******************************");
        InCaps caps=(String a)->a.toUpperCase();
        System.out.println(caps.incaps("something"));
    }

    public static void ex2Q1(){
        System.out.println("*****************Excercise 2 Question 1*******************************");
        Ex2Q1 ex2Q1=Utility::add;
        System.out.println(ex2Q1.doSomething(1,2));
        System.out.println(ex2Q1.doSomething(5,6));
        ex2Q1=Utility::sub;
        System.out.println(ex2Q1.doSomething(2,1));
        System.out.println(ex2Q1.doSomething(5,6));
        ex2Q1=Utility::multi;
        System.out.println(ex2Q1.doSomething(2,1));
        System.out.println(ex2Q1.doSomething(5,6));
        ex2Q1=Utility::divide;
        System.out.println(ex2Q1.doSomething(2,1));
        System.out.println(ex2Q1.doSomething(42, 6));
    }

    public static void ex2Q2(){
        System.out.println("*****************Excercise 2 Question 2*******************************");

        EmpInterface empInterface = Employee::new;

    }

}