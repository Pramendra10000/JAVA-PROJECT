package com.og.program.File;

import java.util.Scanner;
import com.og.program.pattern.RightTrianglePattern;

public class JavaBasicPrograms {
    public void JavaBasicProgramsList() {
        Scanner sc = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("\n\n\n : : WELCOME TO ALL LOGICL PROGRAM APP : :\n\n");

            System.out.println("\n|| 1.Prime no || 2.Fibonacci Series || 3.Palindrome No || 4.Factorial No || 5.Armstrong Number || 6.Random No Example || \n\n|| 7.Right Triangle Star Pattern || 8.Compare Two Objects || 9.Create An Object In Java || 10. || 11. || 12. ||\n\n");
            
            System.out.print("Select The Above Option (or enter 0 to exit): : : -");

            int Prog = sc.nextInt();

            switch (Prog) {
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    continueRunning = false;
                    break;
                case 1:
                    System.out.println("\n\n   Program in below .\n\n");
                    Prime_No pn = new Prime_No();
                    pn.checkPrime();
                    break;
                case 2:
                    System.out.println("\n\n   Program in below .\n\n");
                    Fibonacci fb = new Fibonacci();
                    fb.fibonacciseries();
                    break;
                case 3:
                    System.out.println("\n\n   Program in below .\n\n");
                    Palindrome pm = new Palindrome();
                    pm.PalindromeNo();
                    break;
                case 4:
                    System.out.println("\n\n   Program in below .\n\n");
                    Factorial ft = new Factorial();
                    ft.FactorialNo();
                    break;
                case 5:
                    System.out.println("\n\n   Program in below .\n\n");
                    ArmstrongNo am = new ArmstrongNo();
                    am.ArmstrongNumber();
                    break;
                case 6:
                    System.out.println("\n\n   Program in below .\n\n");
                    RandomNo rn = new RandomNo();
                    rn.RandomNumber();
                    break;
                case 7:
                    System.out.println("\n\n   Program in below .\n\n");
                    RightTrianglePattern rt = new RightTrianglePattern();
                    rt.RightTrianglePatternExample();
                    break;
                case 8:
                    System.out.println("\n\n   Program in below .\n\n");
                    CompareTwoObjects co = new CompareTwoObjects();
                    co.CompareTwoObjectsExample();
                    break;
                case 9:
                    System.out.println("\n\n   Program in below .\n\n");
                    Createanobject ct = new Createanobject();
                    ct.CreateanobjectExample();
                    break;
                case 10:
                    System.out.println("\n\n   Program in below .\n\n");
                    // Add logic for option 10
                    break;
                case 11:
                    System.out.println("\n\n   Program in below .\n\n");
                    // Add logic for option 11
                    break;
                case 12:
                    System.out.println("\n\n   Program in below .\n\n");
                    // Add logic for option 12
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
        }

        sc.close();
    }

}
