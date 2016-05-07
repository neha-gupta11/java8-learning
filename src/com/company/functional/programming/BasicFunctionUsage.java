package com.company.functional.programming;

//According to Java7
public class BasicFunctionUsage {

    public static void main(String[] args) {
        BasicFunction function = new BasicFunction() {
            @Override
            public void doSomething() {
                System.out.println("do something      ");
            }

        };

        function.doSomething();

        //According to java8
        BasicFunction function1=()->{
            System.out.println("1");
            System.out.println("2");
        };
        function1.doSomething();
    }
}
