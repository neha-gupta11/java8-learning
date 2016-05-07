package com.company.lambda2.variableCapture;

import java.util.Arrays;
import java.util.List;

public class ThisInLambda {
    private static final ThisInLambda INSTANCE=new ThisInLambda();
    private int var=1;
    private List<Integer> integers= Arrays.asList(1,2,3,4,5);

    public void doSomething(){
        integers.forEach(x->{
            System.out.println(x + var);
            if(this==INSTANCE){
                System.out.println("this is equal to instance");
                //This 'this' will be different if we were using anonymous inner classes.
            }
        });
    }

    public static void main(String[] args) {
        INSTANCE.doSomething();
    }
}
