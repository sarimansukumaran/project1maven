package pgmquestions;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int result=s;
		int n=0;
		int reminder=0;
		while(s>0)
		{
			reminder=s%10;
			n=n+(reminder*reminder*reminder);
			s=s/10;
		}
		if(n==result)
		{
			System.out.println(result+" is a amstrong number");
		}
		else
		{
			System.out.println(result+" is not a amstrong number");
		}
									
	}

}
