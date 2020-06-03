package com.optum.eligibility.methods;

public class Calculate {
    public boolean isprime(int num){
        int temp;
       boolean isprime = true;
        for(int i = 2; i <=num / 2;  i++){
        temp = num % i;
            if(temp == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public boolean isprime(double  doublevalue){
        int num =(int) doublevalue;
        int temp;
        boolean isprime = true;
        for(int i = 2; i<=num/2;  i++){
            temp = num % i;
            if(temp == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

}
