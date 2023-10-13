package pkg;

import java.util.Scanner;

public class Singledimentionalarraystring {

	public static void main(String[] args) {
		System.out.println("Enter Names");
		Scanner sc=new Scanner(System.in);
		String[] ar=new String[3];
		
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.next();
		}
		System.out.println("Entered names are");
		for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}
		

	}

}
