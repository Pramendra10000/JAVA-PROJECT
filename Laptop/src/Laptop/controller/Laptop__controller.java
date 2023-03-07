
package Laptop.controller;

import java.util.Scanner;

import Laptop.model.Laptop;

// Class
public class Laptop__controller {

	public static void main(String[] args) {
		System.out.println("      === Welcome to Laptop shop ====");
		laptop_func lf = new laptop_func();

		Laptop lap = new Laptop();

		lap.setId(10);
		lap.setName("Dell");
		lap.setModel("EWiska");
		lap.setRam("8GB");
		lap.setPrice(35545);
		
		Laptop lap1 = new Laptop();
		
		lap1.setId(11);
		lap1.setName("HP");
		lap1.setModel("HPIOKJ7898");
		lap1.setRam("16GB");
		lap1.setPrice(45856);

		// Calling add() Laptop method to
		// add static data/(Hard CodedData) to linked List
		lf.AddLaptop(lap);
		lf.AddLaptop(lap1);

		// Creating Scanner Object to read input
		Scanner input = new Scanner(System.in);

		// Creating option integer variable
		int option = 0;

		// Do - While loop
		do {
			menu();
			option = input.nextInt();

			// Switch case
			switch (option) {

			// Case 1
			case 1:

				// Display message
				System.out.println("What is the Laptop id Number:- ");
				int id = input.nextInt();

				System.out.println("What is the new Laptop Name:- ");
				String name = input.next();

				System.out.println("What is the new Laptop Model:- ");
				String model = input.next();
				

				System.out.println("What is the new Laptop RAM:- ");
				String Ram = input.next();
				

				System.out.println("What is the new Laptop Price :- ");
				long Rs = input.nextLong();

			Laptop lapt =new Laptop(id, name, model, Ram, Rs);
				
				lf.AddLaptop(lapt);
				System.out.println(lapt.toString());

			
				break;

			// Case 2
			case 2:

				// Display message
				System.out.print("What is the Laptop id number:- ");
				int rId = input.nextInt();

				// Invoke remove/delete Laptop
				lf.DeleteLaptop(rId);

				break;

			// Case 3
			case 3:

				// Display message
				System.out.print("What is the Laptop id number? ");

				int rIdNo = input.nextInt();
				lf.UpdateLaptop(rIdNo, input);

				break;

			// Case 4
			case 4:

				// Display message
				System.out.print("What is the Laptop id:- ");
				int lapid = input.nextInt();

				if (!lf.SearchLaptop(lapid)) {
					System.out.println("Laptop id does not exist\n");
				}

				break;

			// Case 5
			case 5:
				lf.display_All_Laptop();
				break;

			// Case 6
			case 6:

				// Display message
				System.out.println("\nThank you for Visit in Laptop  shop. Goodbye!\n");
				System.exit(0);

				break;

			// Case 7: Default case
			// If none above case executes
			default:

				// Print statement
				System.out.println("\nInvalid input\n");
				break;
			}
		}

		// Checking condition
		while (option != 6);
	}

	// Method 2
	// Menu - Static menu for displaying options
	public static void menu() {

		// Printing statements displaying menu on console
		
		System.out.println(" ");
		System.out.println("           Enter your selection :- ");
		System.out.println("              1: Add Laptop");
		System.out.println("              2: Delete Laptop");
		System.out.println("              3: Update Laptop");
		System.out.println("              4: Search Laptop");
		System.out.println("              5: Display Laptops");
		System.out.println("              6: Exit program");
		
	}
}
