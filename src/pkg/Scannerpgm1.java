package pkg;

import java.util.Scanner;

public class Scannerpgm1 {

	public static void main(String[] args) {
		System.out.println("Enter five name");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a=sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		String d=sc.nextLine();
		System.out.println("names are "+s+" , "+a+" , "+b+" , "+c+" , "+d);
	}
}
