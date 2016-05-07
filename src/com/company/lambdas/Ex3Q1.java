package com.company.lambdas;


public interface Ex3Q1 {
    static void display1(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>.. static display method1 ");
    }

    static void display2(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>.. static display method2 ");
    }

    default void concrete(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Ex3Q3 concrete method1 ");
    }
}
