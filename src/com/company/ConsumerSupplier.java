package com.company;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplier {
    public static void main(String[] args) {
        Item item1=new Item("Item1");
        Item item2=new Item("Item2");
        Item item3=new Item("Item3");
        Item item4=new Item("Item4");
        List<Item> items= Arrays.asList(item1,item2,item3);

        //Supplier returns an object using getter method.
        Supplier supplier=()-> items.stream().findFirst();
        System.out.println(supplier.get());

        //whereas Consumes consumes using accept method
        Consumer<Item> consumer=(item)->items.add(item);
        consumer.accept(item4);
    }
}
