package com.core.lambdaexpression;
public class Calculator {
 
    interface IntegerMath {
        int operation(int a, int b); 
//        int oper(int c, int d, int e);
    }
 
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
 
    public static void main(String... args) {
 
        Calculator myApp = new Calculator();
        IntegerMath addition = (int a, int b) -> a + b;
        IntegerMath subtraction = (a, b) -> {return (a - b) ;};
        System.out.println("40 + 2 = " +
            myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
            myApp.operateBinary(20, 10, subtraction));    
    }
}