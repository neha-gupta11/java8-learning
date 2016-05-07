package com.company.regex;


public class Experiments {

    public static void main(String[] args) {
        String somestr="sjdhfjs&dfjd";
        String somestr1="sjdhfjsdfj;d";
        String somestr2="sjdhf|jsdfjd";
        String somestr3="sj&dh;f|jsdfjd";
        String somestr4="sjd";
//        System.out.println(somestr.matches(".*[&;|].*"));
//        System.out.println(somestr1.matches(".*[&;|].*"));
//        System.out.println(somestr2.matches(".*[&;|].*"));
//        System.out.println(somestr3.matches(".*[&;|].*"));
//        System.out.println(somestr4.matches(".*[&;|].*"));


        somestr4="sjdD2_776";
        System.out.println(somestr4.matches(".*\\d.*")&&somestr4.matches(".*[A-Z].*")&&somestr4.matches(".*[_@].*"));

    }
}
