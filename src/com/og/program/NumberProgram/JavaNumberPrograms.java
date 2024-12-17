package com.og.program.NumberProgram;

import java.util.Scanner;

import com.og.program.File.ArmstrongNo;
import com.og.program.File.CompareTwoObjects;
import com.og.program.File.Createanobject;
import com.og.program.File.Factorial;
import com.og.program.File.Fibonacci;
import com.og.program.File.Palindrome;
import com.og.program.File.Prime_No;
import com.og.program.File.RandomNo;
import com.og.program.pattern.RightTrianglePattern;

public class JavaNumberPrograms {
	public void JavaNumberProgramsList() {

		System.out.println("\n\n   : : Select From below Programs : :\n\n");

		

		System.out.println("\n|| 1.Reverse a Number || 2.Fibonacci Series || 3.Palindrome No || 4.Factorial No || 5.Armstrong Number || 6.Random No Example || \n\n|| 7.Right Triangle Star Pattern || 8.Compare Two Objects || 9.Create An Object In Java || 10. || 11. || 12. ||\n\n");
		
		System.out.print("Select The  Above Option : : : -");
		
		Scanner sc = new Scanner(System.in);
		int Prog = sc.nextInt();

		switch (Prog) {
		case 1:  System.out.println("\n\n   Program in below .\n\n");
		          ReverseaNumber rv = new ReverseaNumber();
		          rv.ReverseaNumberExample();

			break;
		case 2:  System.out.println("\n\n   Program in below .\n\n");  
                    Fibonacci fb = new Fibonacci();
                    fb.fibonacciseries();
			break;
		case 3:  System.out.println("\n\n   Program in below .\n\n");
		             Palindrome pm = new Palindrome();
		              pm.PalindromeNo();
			break;
		case 4:  System.out.println("\n\n   Program in below .\n\n");
                      Factorial ft = new Factorial();
                      ft.FactorialNo();
			break;
		case 5:  System.out.println("\n\n   Program in below .\n\n");
                    ArmstrongNo am = new ArmstrongNo();
                    am.ArmstrongNumber();
			break;
		case 6:  System.out.println("\n\n   Program in below .\n\n");
		         RandomNo rn = new RandomNo();
		         rn.RandomNumber();

			break;
		case 7:  System.out.println("\n\n   Program in below .\n\n");
                  RightTrianglePattern rt = new RightTrianglePattern();
                  rt.RightTrianglePatternExample();
			break;
		case 8:  System.out.println("\n\n   Program in below .\n\n");
                  CompareTwoObjects co = new CompareTwoObjects();
                  co.CompareTwoObjectsExample();
			break;
		case 9:  System.out.println("\n\n   Program in below .\n\n");
                 Createanobject ct = new Createanobject();
                 ct.CreateanobjectExample();
			break;
		case 10:  System.out.println("\n\n   Program in below .\n\n");
                  
			break;
		case 11:  System.out.println("\n\n   Program in below .\n\n");

			break;
		case 12:  System.out.println("\n\n   Program in below .\n\n");

			break;

		default:
			break;
		}

	}
}
