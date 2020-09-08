package com.testing.kapitel1;

public class Calculator {
    //1.6
    public static int AddupToN(int n) {
        int sum;
        sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum += i;
        }
        return sum;

    }
    //1.12
    public static void main(String[] args) {
        System.out.println(AddupToN(10));
    }
}
