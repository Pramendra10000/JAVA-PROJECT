//package Laptop.controller;
//
//import java.util.Scanner;
//
//import Laptop.model.Laptop;
//
//public class Laptop_controller {
//
//
//	Laptop lp;
//	
//
//	public static void main(String[] args) {
//		Header();
//		
//		Shop();
//	
//		Footer();
//}
//	
//	public static void Header() {
//		System.out.println("=== Welcome to Laptop shop ====");
//	}
//	
//	public static void Footer() {
//		System.out.println("=== Thanks for visit  ====");
//	}
//	
//	public static void Shop() {
//		Scanner sc  =new Scanner(System.in);
//		System.out.println("  ");
//		System.out.println("1.AddLaptop  2.DeleteLaptop 3.UpdateLaptop");
//		int a=sc.nextInt();
//		
//		switch (a) 
//		{
//		case 1: {
//			System.out.println("Add your laptop details >>"); 
//			AddLaptop();
//			
//		}
//		
//		break;
//		
//		case 2: {
//			System.out.println("Edit your laptop details >>");
//		}
//		
//		break;
//		
//		default:{
//			throw new IllegalArgumentException("Unexpected value: " +a);
//		}
//		
//	}
//	}
//	
//	
//	public static void AddLaptop() {
//		
//		Laptop laptop =new Laptop(0, null, null, null, 0);
//		
//		Scanner sa=new Scanner(System.in);
//		int a=sa.nextInt();
//		String b=sa.next();
//		long c=sa.nextLong();
//		
//		System.out.print("Id:");
//		laptop.setId(a);
//		laptop.setName(b);
//		laptop.setModel(b);
//		laptop.setRam(b);
//		laptop.setPrice(c);
//		
//		Shop();
//	}
//	
//   public static void EditLaptop() {
//		
//	}
//   
//   public static void DeleteLaptop() {
//		
//	}
//   
//}
