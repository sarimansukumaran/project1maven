package pgmquestions;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		System.out.println("Enter a sentence");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.endsWith("language"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
