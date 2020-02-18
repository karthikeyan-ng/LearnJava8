package com.techstack.problems;

import java.math.BigInteger;

public class CalculateFactorialForTheGivenNumberAndFindHowManyZerosAtTheEnd {

    public static int zeros(int n) {
        int i;
        BigInteger value = BigInteger.ONE;
        int number=n;
        for(i = 1; i <= number; i++){
            value = value.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + number + " is: " + fact);

        long result = value.longValue();
        int trailingZeroes = String.valueOf(value.toString()).length() - String.valueOf(value.toString()).replaceAll("0*$","").length();

        return trailingZeroes;
    }

    public static void main(String[] args) {
        System.out.println(CalculateFactorialForTheGivenNumberAndFindHowManyZerosAtTheEnd.zeros(23));
    }
}
