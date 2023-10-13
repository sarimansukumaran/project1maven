package pkg;

import java.util.Scanner;

public class Scannercalculator {

	public static void main(String[] args) {
	
		System.out.println("Choose any Operator");
		Scanner sc=new Scanner(System.in);
		char operator=sc.next().charAt(0);
		System.out.println("Enter any two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		double result=0;
		switch(operator)
		{
		case '+':
			 result=a+b;
		break;
		
		case '-': result =a-b;
		break;
		
		case '*': result=a*b;
		break;
		
		case '/': result=a/b;
		break;
		
	    default:System.out.println("invalied");
		
		}
		System.out.println("reslt="+result);
	}

}
