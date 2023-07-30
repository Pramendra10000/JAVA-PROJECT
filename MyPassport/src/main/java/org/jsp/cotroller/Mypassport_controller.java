package org.jsp.cotroller;

import org.jsp.dto.Passport;
import org.jsp.dto.Person;

import java.security.PublicKey;
import java.util.Scanner;

import org.jsp.dao.Mypassport_dao;

public class Mypassport_controller {

	public static Person p = new Person();
	public static Passport pt= new Passport();
	public static Mypassport_dao md =new Mypassport_dao();
	public static Mypassport_controller mp =new Mypassport_controller();

	public static void main(String[] args) {

		Mypassport_controller ml= new Mypassport_controller();
		
		Scanner d = new Scanner(System.in);
		System.out.println("Welcome To PassPort Office \n\n");
		System.out.println("1.WANTS VISA    2.UPDATE DETAILS     3.FIND DETAILS   4.EXIT");
		int choice = d.nextInt();

		switch (choice) {
		case 1:mp.savePassport();
        break;

		case 2: mp.UpdatePassport();
        break;
			
		case 3: mp.FindDetails();
        break;

		case 4: System.out.println(" THANK YOU FOR VISIT ");
		break;
		
		default:
			break;
		}

	}

	public static void Person_Insert() {

		Scanner d = new Scanner(System.in);
		System.out.println("Welcome To PassPort Office");

		System.out.println("SET PERSON DETAILS : : >>>>");

		Person p = new Person();
		System.out.println("\n SET PERSON ID : :");
		p.setId(d.nextInt());
		System.out.println("\n SET PERSON NAME : :");
		p.setName(d.next());
		System.out.println("\n SET PERSON PAN NO : :");
		p.setPAN(d.next());
		System.out.println("\n SET PERSON LOCATION : :");
		p.setLoc(d.next());
		System.out.println("\n SET PERSON MOB_NO : :");
		p.setMOB(d.nextLong());

		System.out.println("ALL THE PERSON DATA : : :" + p.toString());
		Passport_Insert();
		p.setPassport(pt); // it is present in person class

	}

	public static void Passport_Insert() {
		Scanner d = new Scanner(System.in);

		System.out.println("SET PASSPORT DETAILS : : >>>>");

		System.out.println("\n SET PASSPORT NO : :");
		pt.setPsno(d.nextLong());
		System.out.println("\n SET PASSPORT COLOR : :");
		pt.setColor(d.next());
		System.out.println("\n SET PASSPORT NATIONALITY : :");
		pt.setNationality(d.next());
		System.out.println("\n SET PASSPORT GEMDER : :");
		pt.setGender(d.next());
		System.out.println("\n SET PASSPORT PLACE OF IDENTITY : :");
		pt.setPOI(d.next());
		System.out.println("\n SET PASSPORT DATE OF IDENTITY : :");
		pt.setDOI(d.next());

		System.out.println("ALL THE PASSPORT DATA : : :" + p.toString());
	}

	public void savePassport() {
		// save =========
		Person_Insert();
		md.savePerson(p);
		md.savePassport(pt);
		System.out.println(" \n DATA SAVED >> !!");

	}

	public void UpdatePassport() {
		
		Scanner d = new Scanner(System.in);
		System.out.println("1.PERSON DETAILS    2.PASSPORT DETAILS      3.EXIT");
		int choice = d.nextInt();

		switch (choice) {
		case 1:md.UpdatePerson(p);
        break;

		case 2: md.UpdatePassport(pt);
        break;
		
		case 3: System.out.println(" THANK YOU FOR VISIT ");
		break;
		
		default:
			break;
		}
		// Update ========
		md.UpdatePerson(p);
		System.out.println("\n DATA Updated >> !!");
	}

	public void FindDetails() {

// Find with Id and Psno ========
		Scanner d = new Scanner(System.in);
		System.out.println("  SELECT THE OPTION WATS TO FIND  ");
		System.out.println("1.PERSON DETAILS    2.PASSPORT DETAILS     3.EXIT   ");
		int choice = d.nextInt();

		switch (choice) {
		case 1: System.out.println("KINDLY PROVIDE PERSON ID :- "); md.Findperson(d.nextInt());
        break;

		case 2: System.out.println("KINDLY PROVIDE PASSPORTNO : -"); md.FindPassport(d.nextLong());
        break;
		
		case 3: System.out.println(" THANK YOU FOR VISIT "); 
		break;
		
		default:
			break;
		}
	
	}

}
