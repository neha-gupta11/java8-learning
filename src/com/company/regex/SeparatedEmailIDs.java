package com.company.regex;

public class SeparatedEmailIDs {

    public static void main(String...args) {
        String emails="Kavita Bora <kavita.bora@tothenew.com>, Richa Kumari <richa.kumari@tothenew.com>, Prakriti Sharma <prakriti.sharma@tothenew.com>, Rajan Jadon <rajan.jadon@tothenew.com>, Saurabh Mittal <saurabh.mittal@tothenew.com>, Vikrant Kumar <vikrant.kumar@tothenew.com>, Aseem Bansal <aseem.bansal@tothenew.com>, Rohit Verma <rohit.verma@tothenew.com>";
        String spaceSeparatedEmailIDs=emails.replaceAll(">.*?<|^.*?<|>"," ");
        System.out.println(spaceSeparatedEmailIDs);

    }
}
