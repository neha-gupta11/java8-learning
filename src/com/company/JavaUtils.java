package com.company;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaUtils {
    static Integer i=90;

    public static void main(String[] args) {
        utils();
    }

    public static void utils(){
        System.out.println("**************************Consumer accepts*******************************");
        Consumer consumer=(a)-> System.out.println("thanks for "+a);

        consumer.accept(2);
        consumer.accept("Food");


        System.out.println("**********************Supplier get**********************************");
        Supplier supplier=()->i;
        System.out.println(supplier.get());

        System.out.println("******************************Predicate test***********************");
        Predicate<Integer> predicate=(a)->a>18;
        System.out.println(predicate.test(23));
        System.out.println(predicate.test(56));
        System.out.println(predicate.test(10));

        System.out.println("****************************Function apply**************************");
        Function<Integer,Integer> function=(a)->a+i;
        System.out.println(function.apply(10));
        System.out.println(function.apply(20));
    }
}
