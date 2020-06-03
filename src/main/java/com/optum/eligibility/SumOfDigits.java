package com.optum.eligibility;

public class SumOfDigits {
    public static void main(String[] args) {
        int value = 123456789;
        int sumOfDigits = 0;
        while(true){
            sumOfDigits = sumOfDigits + value%10;
            value = value/10;
            if(value<10){
                break;
            }
        }
        sumOfDigits = sumOfDigits + value;
        System.out.println(sumOfDigits);

    }
}

