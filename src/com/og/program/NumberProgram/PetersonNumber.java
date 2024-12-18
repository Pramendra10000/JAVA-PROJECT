package com.og.program.NumberProgram;


import java.util.Scanner;

public class PetersonNumber {
    long[] factorial = new long[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600 };

    public boolean isPeterson(int n) {
        int num = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += factorial[digit];
            n = n / 10;
        }
        return (sum == num);
    }

    public void checkPeterson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        if (isPeterson(n))
            System.out.println("The given number is a Peterson number.");
        else
            System.out.println("The given number is not a Peterson number.");
        sc.close();
    }
}

