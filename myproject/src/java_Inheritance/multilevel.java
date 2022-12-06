package java_Inheritance;

import java.util.Scanner;

public class multilevel {

public static void sub()	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("=================== WELCOME TO PROJECT ===================\n");
		System.out.print("Enter Your name :- \n");
		String s=sc.next();
		System.out.print( "Welcome "+s+" In our web site..\n\n");
	}
	
	
}
class level1 extends multilevel{
	
	public static void selection(){
		Scanner sc1=new Scanner(System.in);
		System.out.println("Select the below Lang you want to learn :-\n");
		System.out.println("====== 1.java  2.Sql  3.Bootstrap 4.Html 5.Css ========");
		int i=sc1.nextInt();
		
		
		switch (i) {
		case 1: System.out.println("click on below link for java :- \n"+"https://www.w3schools.com/java/default.asp");
		break;
		case 2: System.out.println("click on below link for Sql :- \n"+"https://www.w3schools.com/sql/default.asp");
		break;
		case 3: System.out.println("click on below link for Bootstrap :- \n"+"https://www.w3schools.com/bootstrap/bootstrap_ver.asp");
		break;
		case 4: System.out.println("click on below link for Html :-\n"+"https://www.w3schools.com/html/default.asp");
		break;
		case 5: System.out.println("click on below link for Css :- \n"+"https://www.w3schools.com/w3css/default.asp");
		break;
	
		}
	}
	
}

class level2 extends level1 {
	
	public static void feedback() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("\n=====  Give your valuble feedback ======");
		System.out.println("[====   1.veryGood    2.Good    3.Fair ==== ]\n");
		int i=sc1.nextInt();
		
		switch (i) {
		case 1:System.out.println("**  Thank you , Hope you are happy with this Help **\n");
	    break;
		case 2:System.out.println("**  Thank you , We will try to give our best .**\n");
		break;
		case 3:System.out.println("**  Thank you ,  We will do needfull changes , kindly share your thaught in the comment .**\n");
		break;
		
		default : System.out.println(" ** Thank you for your visit. ** \n");
		System.out.println("============================================ @pramendra =======");
	    break;
		}
	}
	
}


class Driver {
	
	public static void main(String[] args) {
		
		level2 l=new level2();
		level2.sub();
		level2.selection();
		level2.feedback();
		
	}
}
