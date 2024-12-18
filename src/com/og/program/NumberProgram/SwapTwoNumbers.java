package com.og.program.NumberProgram;



import java.util.Scanner;

public class SwapTwoNumbers {
    // Method to swap two numbers
    public void swapNumbers() {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        b = scanner.nextInt();
        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);
        
        // Swapping logic
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);
        scanner.close();
    }
}
