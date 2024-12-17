package com.og.program.NumberProgram;


import java.util.Scanner;

public class SmallestNumber {
    // Find the smallest number
    public void findSmallest() {
        int a, b, c, smallest, temp;
        Scanner sc = new Scanner(System.in);
        
        // Reading input from the user
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();

        // Compare and find the smallest number
        temp = a < b ? a : b;
        smallest = c < temp ? c : temp;

        // Print the smallest number
        System.out.println("The smallest number is: " + smallest);
        sc.close();
    }
}

