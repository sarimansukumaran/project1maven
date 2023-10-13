package pkg;

import java.util.Scanner;

public class Singledimentionalarray {

	public static void main(String[] args) {
		
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		
		int[] ar=new int[3];
		
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered numbers=");
		for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}

	}

}
