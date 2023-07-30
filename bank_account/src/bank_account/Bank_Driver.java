package bank_account;

import java.util.Scanner;

public class Bank_Driver {

	public static void main(String[] args) {

		Scanner d=new Scanner(System.in);
		System.out.println("Enter bank name to open account");
		String bname =d.next();
		System.out.println("Enter add of bank");
		String loc =d.next();
		System.out.println("Enter Bank IFSC code");
		String ifsc_code =d.next();
		Bank b=new Bank(bname, loc, ifsc_code);
		
		boolean option=true;
		while(option)
		{
			System.out.println("Enter your Choice");
			System.out.println("ENTER 1. FOR CREATE ACCOUNT");
			
			System.out.println("ENTER 2. FOR CHECK DETAILS");
			System.out.println("ENTER 3. FOR DEPOSITE MONEY");
			
			System.out.println("ENTER 4.FOR WITHDRAW");
			System.out.println("ENTER 5. FOR DELETE ACCOUNT");
			
			System.out.println("ENTER 6. FOR EXIT OR CLOSE APPLICATION");
			System.out.println();
			
			
			int choice=d.nextInt();
			switch(choice) {
			
			case 1:{
				
				 System.out.println("ENTER NAME");
					String name=d.next();
					System.out.println("ENTER DOB");
					String dob=d.next();
					System.out.println("ENTER PIN");
					String pin=d.next();
					System.out.println("ENTER MONEY TO DEPOSITE");
					double money=d.nextDouble();
					System.out.println("ENTER ACCOUNT NO OF YOUR CHOICE");
					long ano=d.nextLong();
					b.createAccount(new Account(name,dob,pin,money,ano));
					System.out.println("==========================================================");
				
			}break;
			
		  
			case 2:{
				b.bankDetails();
				System.out.println("==============================");
			
			}break;
			
			case 3: {
				
			}break;
				
			case 4: {
				
				
			}break;
				
			case 5: {
				
				
			}break;
				
			case 6:{
				System.out.println("Thank you for using"+bname);
				System.out.println("    HAVE A GOOD DAY....!!!!");
				option=false;
				
			}break;
				
			default :{
				
				System.out.println("ENTER YOUR VALID CHOICE");
				break;
			}
				
			
		}
		
	}

}
}