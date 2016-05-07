package com.company.functional.programming;

public class FunctionsUsingLambda {

    public static void main(String[] args) {
        BasicFunction function=()-> System.out.println("let's do programming using lambda's");

        HigherOrderFunction orderFunction=(function1)->{
            function1.doSomething();
            function1.doSomething();
        };

        orderFunction.doSomething(function);
    }
}
