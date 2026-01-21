package org.example;

public class Calculator {



    public void main(){


    }

    public static int add(int a, int b){
        return a + b;

    }

    public static int add(int a, int b,int c){
        return a + b + c;
    }
    public static int add(int... numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

}
