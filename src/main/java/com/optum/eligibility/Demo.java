package com.optum.eligibility;

import com.optum.eligibility.methods.Calculate;

public class Demo {
    public static void main(String[] args) {
        Calculate prime = new Calculate();
        if (prime.isprime(23)) {
            System.out.println("number passed is prime");
        } else {
            System.out.println("number passed is not prime");
        }
        }
    }

