package java_Inheritance;

import java.util.Scanner;

class single_level {

	 {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Place name :-");
			String s=sc.next();
		System.out.println("Place are:- "+s);
			
		}
		
	}
	class info extends  single_level{
		{
			
			System.out.println("You are in these place");
		}

	}

	class driver2 {
		
		public static void main(String[] args) {
			
			info ref= new info();
		
		}
	}