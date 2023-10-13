package pkg;

import java.util.Scanner;

public class Arraysumpgm {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter 10 numbers");
		Scanner sc=new Scanner(System.in);
		
		int[] ar=new int[10];
		 for(int i=0;i<10;i++)
		 {
			 ar[i]=sc.nextInt();
			 sum=sum+ar[i];
		 }
		 System.out.println("sum of numbers="+sum);
		 
	}

}
