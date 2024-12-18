package com.og.program.NumberProgram;

import java.util.Scanner;

import com.og.program.File.ArmstrongNo;
import com.og.program.File.CompareTwoObjects;
import com.og.program.File.Createanobject;
import com.og.program.File.Factorial;
import com.og.program.File.Fibonacci;
import com.og.program.File.Palindrome;
import com.og.program.File.RandomNo;
import com.og.program.pattern.RightTrianglePattern;

public class JavaNumberPrograms {
	public void JavaNumberProgramsList() {
		Scanner sc = new Scanner(System.in);
		boolean continueRunning = true;

		while (continueRunning) {
			System.out.println("\n\n   : : Select From Below Programs : :\n\n");
			System.out.println(
					"\n|| 1.Reverse a Number || 2.Number To Word || 3.Automorphic Number || 4.Peterson Number || 5.ATM Program || 6.Nth Prime Number || \n\n|| 7.Find Square Root  || 8.Swap Two Numbers || 9.Find GCD No || 10.Largest Number || 11.Smallest Number || 12.CheckPerfectSquare ||\n\n || 13.Display Even Odd Numbers  || 14.Display Even Odd Numbers  ||15. ||\n\n");

			System.out.print("Select The Above Option (or enter 0 to exit): : : -");

			try {
				int Prog = sc.nextInt();

				switch (Prog) {
				case 0:
					System.out.println("Exiting the program. Goodbye!");
					continueRunning = false;
					break;
				case 1:
					System.out.println("\n\n   Program in below .\n\n");
					ReverseaNumber rv = new ReverseaNumber();
					rv.ReverseaNumberExample();
					break;
				case 2:
					System.out.println("\n\n   Program in below .\n\n");
					NumberToWordExample nm = new NumberToWordExample();
					nm.numberToWords("1234".toCharArray());
					break;
				case 3:
					System.out.println("\n\n   Program in below .\n\n");
					AutomorphicNumber ap = new AutomorphicNumber();
					ap.isAutomorphic(123);
					break;
				case 4:
					System.out.println("\n\n   Program in below .\n\n");
					PetersonNumber ptn = new PetersonNumber();
					ptn.checkPeterson();
					break;
				case 5:
					System.out.println("\n\n   Program in below .\n\n");
					ATMprogram atm = new ATMprogram();
					atm.startATM();
					break;
				case 6:
					System.out.println("\n\n   Program in below .\n\n");
					NthPrimeNumber nth = new NthPrimeNumber();
					nth.findNthPrime();
					break;
				case 7:
					System.out.println("\n\n   Program in below .\n\n");
					FindSquareRoot fnd = new FindSquareRoot();
					fnd.findSquareRoot();
					break;
				case 8:
					System.out.println("\n\n   Program in below .\n\n");
					SwapTwoNumbers swp = new SwapTwoNumbers();
					swp.swapNumbers();
					break;
				case 9:
					System.out.println("\n\n   Program in below .\n\n");
					FindGCD fg = new FindGCD();
					fg.computeGCD();
					break;
				case 10:
					System.out.println("\n\n   Program in below .\n\n");
					LargestNumber lgn = new LargestNumber();
					lgn.findLargest();
					break;
				case 11:
					System.out.println("\n\n   Program in below .\n\n");
					SmallestNumber smn = new SmallestNumber();
					smn.findSmallest();
					break;
				case 12:
					System.out.println("\n\n   Program in below .\n\n");
					CheckPerfectSquare chk = new CheckPerfectSquare();
					chk.findPerfectSquare();
					break;
				case 13:
					System.out.println("\n\n   Program in below .\n\n");
					DisplayEvenOddNumbers deo = new DisplayEvenOddNumbers();
					deo.chooseAndDisplay();
					break;
				case 14:
					System.out.println("\n\n   Program in below .\n\n");
					SumOfNaturalNumber snf = new SumOfNaturalNumber();
					snf.interactiveSum();
					break;
				case 15:
					System.out.println("\n\n   Program in below .\n\n");
					
					break;
				case 16:
					System.out.println("\n\n   Program in below .\n\n");
					
					break;
				case 17:
					System.out.println("\n\n   Program in below .\n\n");
					
					break;

				default:
					System.out.println("Invalid option. Please select a valid option.");
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter a number.");
				sc.next(); // Clear the invalid input
			}
		}

		sc.close();
	}
}
