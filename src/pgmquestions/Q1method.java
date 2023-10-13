package pgmquestions;

import java.util.Scanner;

public class Q1method {
	public void sum()
	{
		
	}

	public static void main(String[] args) {
		System.out.println("Enter n numbers");
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[5];
		int sum=0;
		for(int i=0;i<5;i++)
		 {
			 ar[i]=sc.nextInt();
			 sum=sum+ar[i];
		 }
		 System.out.println("sum of numbers="+sum);
	}

}
