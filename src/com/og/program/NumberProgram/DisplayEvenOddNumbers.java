package com.og.program.NumberProgram;

import java.util.Scanner;

public class DisplayEvenOddNumbers {
    // Method to display even numbers up to a given limit
    public void displayEvenNumbers(int number) {
        System.out.print("List of even numbers from 1 to " + number + ": ");
        for (int i = 2; i <= number; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line
    }

    // Method to display odd numbers up to a given limit
    public void displayOddNumbers(int number) {
        System.out.print("List of odd numbers from 1 to " + number + ": ");
        for (int i = 1; i <= number; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line
    }

    // Interactive method to choose and display even or odd numbers
    public void chooseAndDisplay() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Menu options for the user
        System.out.println("\nChoose an option:");
        System.out.println("1. Display Even Numbers");
        System.out.println("2. Display Odd Numbers");
        System.out.println("3. Exit");

        // Take user choice as input
        int choice = scanner.nextInt();

        // Switch-case to handle the user's choice
        switch (choice) {
            case 1:
                displayEvenNumbers(number); // Display even numbers
                break;
            case 2:
                displayOddNumbers(number); // Display odd numbers
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }

        scanner.close();
    }
}
