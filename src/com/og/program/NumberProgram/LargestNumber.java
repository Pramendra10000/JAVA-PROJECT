package com.og.program.NumberProgram;


import java.util.Scanner;

public class LargestNumber {
    // Find the largest number
    public void findLargest() {
        int a, b, c, largest, temp;
        Scanner sc = new Scanner(System.in);
        
        // Reading input from the user
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();

        // Compare and find the largest number
        temp = a > b ? a : b;
        largest = c > temp ? c : temp;

        // Print the largest number
        System.out.println("The largest number is: " + largest);
        sc.close();
    }
}

