package Laptop.controller;

import java.util.LinkedList;
import java.util.Scanner;

import Laptop.model.Laptop;

public class laptop_func {

	LinkedList<Laptop> list;

	public laptop_func() {
		list = new LinkedList<>();
	}

	public void AddLaptop(Laptop laptop) {

		// Checking if a Laptop already exists or not,
		// if not add it to Laptop list, Otherwise
		// error display message
		if (!SearchLaptop(laptop.getId())) {
			list.add(laptop);
		} else {

			// Print statement
			System.out.println("Laptop already exists in the Laptop list");
		}
	}

	public boolean SearchLaptop(int id) {

		// Iterating Laptop list
		// using for each loop
		for (Laptop l : list) {

			// Checking Laptop by id Number
			if (l.getId() == id) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}

	// Method 3
	// Delete Laptop
	// @param recid
	public void DeleteLaptop(int recid) {
		Laptop LaptopDel = null;

		// Iterating Laptop list
		for (Laptop ll : list) {

			// Finding Laptop to be deleted by id Number
			if (ll.getId() == recid) {
				LaptopDel = ll;
			}
		}

		// If LaptopDel is null, then show error message,
		// otherwise remove the Laptop from Laptop list
		if (LaptopDel == null) {

			// Displaying no Laptop found
			System.out.println("Invalid Laptop Id");
		} else {

			list.remove(LaptopDel);

			// Display message for successful deletion of
			// Laptop
			System.out.println("Successfully removed Laptop from the list");
		}
	}

	// Method 4
	// Finding Laptop
	// @param id
	// @return
	public Laptop findAllLaptop(int id) {

		// Iterate Laptop list
		// using for each loop
		for (Laptop l : list) {

			// Checking Laptop by id Number.
			if (l.getId() == id) {
				return l;
			}
		}

		return null;
	}

	// Method 5
	// Update Laptop
	// @param id
	// @param input
	public void UpdateLaptop(int id, Scanner input) {

		if (SearchLaptop(id)) {
			Laptop lap = findAllLaptop(id);

			// Display message only
			System.out.println("What is the new Laptop id Number : ");
			int id1 = input.nextInt();

			// Display message only
			System.out.println("What is the new Laptop Name:- ");
			String name2 = input.next();
			input.nextLine();

			// Display message only
			System.out.println("What is the new Laptop Model:- ");
			String model2 = input.nextLine();

			// Display message only
			System.out.println("What is the new Laptop RAM:- ");
			String Ram2 = input.nextLine();

			// Display message only
			System.out.println("What is the new Laptop Price :- ");
			long Rs = input.nextLong();

			lap.setId(id1);
			lap.setName(name2);
			lap.setModel(model2);
			lap.setRam(Ram2);
			lap.setPrice(Rs);

			System.out.println("Laptop Updated Successfully");
		} else {

			// Print statement
			System.out.println("Laptop Not Found in the Laptop list");
		}
	}

	// Method 6
	// Display Laptops
	public void display_All_Laptop() {

		// If Laptop list is empty then
		// print the message below
		if (list.isEmpty()) {

			// Print statement
			System.out.println("The list has no Laptops\n");
		}
		// Iterating Laptop list
		// using for each loop
		for (Laptop Laptop : list) {

			// Printing the list
			System.out.println(Laptop.toString());
		}
	}

}
