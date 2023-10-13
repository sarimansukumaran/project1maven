package pgmquestions;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		char ch;
		do {
		System.out.println("Enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		System.out.println(s1+s2);
		System.out.println("Do you want to continue(Yes/No)");
		ch=sc.next().charAt(0);
		}while(ch=='Y'|| ch=='y');
		
		
		
	}

}
