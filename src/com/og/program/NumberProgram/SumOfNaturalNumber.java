package com.og.program.NumberProgram;

import java.util.Scanner;

public class SumOfNaturalNumber {
    // Method to calculate the sum of natural numbers
    public void calculateSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; ++i) {
            // Adding the value of i to sum
            sum = sum + i;
        }
        // Printing the sum
        System.out.println("Sum of First " + num + " Natural Numbers is = " + sum);
    }

    // Interactive method to get input from user and calculate sum
    public void interactiveSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number up to which you want to find the sum of natural numbers: ");
        int num = sc.nextInt();
        calculateSum(num);
        sc.close();
    }
}
