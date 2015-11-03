package com.company;


public class InterfaceUsages implements Ex3Q1,Ex3Q3{

//    @Override
//    public void concrete() {
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>InterfaceUsages InterfaceUsages concrete1");
//    }

    public static void main(String[] args) {
        Ex3Q1.display1();
        Ex3Q1.display2();
        InterfaceUsages interfaceUsages=new InterfaceUsages();
        interfaceUsages.concrete();
    }
}
