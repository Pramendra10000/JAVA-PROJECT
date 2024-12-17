package com.og.program.NumberProgram;

public class ReverseaNumber {
	public void ReverseaNumberExample() {
	{  
	int number = 987654, reverse = 0;  
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
}
}