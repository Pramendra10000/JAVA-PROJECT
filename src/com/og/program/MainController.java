package com.og.program;

import java.util.Scanner;

import com.og.program.Array.JavaArrayPrograms;
import com.og.program.File.ArmstrongNo;
import com.og.program.File.CompareTwoObjects;
import com.og.program.File.Createanobject;
import com.og.program.File.Factorial;
import com.og.program.File.Fibonacci;
import com.og.program.File.JavaBasicPrograms;
import com.og.program.File.Palindrome;
import com.og.program.File.Prime_No;
import com.og.program.File.RandomNo;
import com.og.program.NumberProgram.JavaNumberPrograms;
import com.og.program.pattern.RightTrianglePattern;

public class MainController {

	public static void main(String[] args) {

		System.out.println(": : WELCOME TO ALL LOGICL JAVA PROGRAM APP : :\n\n");

		System.out.println(
				"\n|| 1.Java Basic Program  || 2.Java Number Programs || 3.Palindrome No || 4.Factorial No || 5.Armstrong Number || 6.Random No Example || \n\n|| 7.Right Triangle Star Pattern || 8.Compare Two Objects || 9.Create An Object In Java || 10. || 11. || 12. ||\n\n");

		System.out.print("Select The  Above Option : : : -");

		Scanner sc = new Scanner(System.in);
		int Prog = sc.nextInt();

		switch (Prog) {
		case 1:
			System.out.println("\n\n       || ||     START FROM HERE     || ||  \n\n");
			JavaBasicPrograms jbp = new JavaBasicPrograms();
			jbp.JavaBasicProgramsList();

			System.out.println("\n\n       || ||     END HERE     || ||  \n\n");

			break;
		case 2:
			System.out.println("\n\n       || ||     START FROM HERE     || ||  \n\n");
			JavaNumberPrograms jnp = new JavaNumberPrograms();
			jnp.JavaNumberProgramsList();
			System.out.println("\n\n       || ||     END HERE     || ||  \n\n");
			break;
		case 3:
			System.out.println("\n\n       || ||     START FROM HERE     || ||  \n\n");
			JavaArrayPrograms jap = new JavaArrayPrograms();
			jap.JavaArrayProgramsList();
			System.out.println("\n\n       || ||     END HERE     || ||  \n\n");
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

			break;
		case 11:
			System.out.println("\n\n   Program in below .\n\n");

			break;
		case 12:
			System.out.println("\n\n   Program in below .\n\n");

			break;

		default:
			break;
		}

	}

}
