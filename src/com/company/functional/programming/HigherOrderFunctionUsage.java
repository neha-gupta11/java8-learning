package com.company.functional.programming;

public class HigherOrderFunctionUsage {

    public static void someFunction(BasicFunction function){
        function.doSomething();
        function.doSomething();
    }

    public static void main(String[] args) {
        BasicFunction function=StaticFunction::function;

        HigherOrderFunction orderFunction=HigherOrderFunctionUsage::someFunction;
        orderFunction.doSomething(function);
    }
}
