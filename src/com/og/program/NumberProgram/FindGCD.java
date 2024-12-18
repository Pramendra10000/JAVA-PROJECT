package com.og.program.NumberProgram;

import java.util.Scanner;

public class FindGCD {
    // Method to find the GCD of two numbers
    public int findGCD(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                gcd = i;
        }
        return gcd;
    }

    // Method to interactively find the GCD of two numbers
    public void computeGCD() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        int gcd = findGCD(x, y);
        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
        sc.close();
    }
}

