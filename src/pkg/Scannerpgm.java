package pkg;

import java.util.Scanner;

public class Scannerpgm {

	public static void main(String[] args) {
		System.out.println("Enter two number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("sum is "+c);

	}

}
