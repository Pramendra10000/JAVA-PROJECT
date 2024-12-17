package com.og.program.NumberProgram;


import java.util.Scanner;

public class FindSquareRoot {
    // user-defined method to find the square root
    public double squareRoot(int num) {
        double t;
        double sqrtroot = num / 2;
        do {
            t = sqrtroot;
            sqrtroot = (t + (num / t)) / 2;
        } while ((t - sqrtroot) != 0);
        return sqrtroot;
    }

    // method to interactively find the square root
    public void findSquareRoot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The square root of " + n + " is: " + squareRoot(n));
        sc.close();
    }
}

