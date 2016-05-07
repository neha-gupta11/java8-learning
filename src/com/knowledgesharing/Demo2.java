package com.knowledgesharing;


public class Demo2 {

    public static void main(String[] args) {
        DoSomethingMore add=(a,b)->a+b;

        DoSomethingMore subtract=(a,b)->{
            return a-b;
        };

        System.out.println(add.doSomething(3,2));
        System.out.println(subtract.doSomething(3,2));
    }
}
