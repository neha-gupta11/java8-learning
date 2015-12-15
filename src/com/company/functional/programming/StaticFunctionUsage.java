package com.company.functional.programming;

public class StaticFunctionUsage {
    public static void main(String[] args) {
        BasicFunction function =StaticFunction::function;
        function.doSomething();
    }
}
