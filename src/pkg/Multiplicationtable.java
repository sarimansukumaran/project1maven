package pkg;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		System.out.println("Enter any number for multiplication table");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
		
			
		{
			
				System.out.println(i+"*"+a+"="+(i*a)); 
			
			
		}

	}

}
