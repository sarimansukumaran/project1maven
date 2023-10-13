package pgmquestions;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		System.out.println("Enter a word");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String reverse="";
		int strlength=s.length();
		for(int i=(strlength-1);i>=0;i--)
		
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
	}

}
