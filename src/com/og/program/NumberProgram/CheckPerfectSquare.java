package com.og.program.NumberProgram;

import java.util.Scanner;

public class CheckPerfectSquare {
    // Method to check if a number is a perfect square
    public boolean checkPerfectSquare(double number) {
        for (int i = 1; i * i <= number; i++) {
            if ((number % i == 0) && (number / i == i)) {
                return true;
            }
        }
        return false;
    }

    // Interactive method to check perfect square
    public void findPerfectSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        if (checkPerfectSquare(number))
            System.out.println("Yes, the given number is a perfect square.");
        else
            System.out.println("No, the given number is not a perfect square.");
        sc.close();
    }
}
