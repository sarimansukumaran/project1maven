package pgmquestions;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int fdigit=0;
		int sdigit=1;
		for(int i=1;i<=s;i++)
		{
			System.out.print(fdigit+",");
			int nextterm=fdigit+sdigit;
			fdigit=sdigit;
			sdigit=nextterm;
		}

	}

}
