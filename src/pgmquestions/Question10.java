package pgmquestions;

import java.util.Scanner;

public class Question10 {

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
		if(s.toLowerCase().equals(reverse.toLowerCase()))
		{
			System.out.println(s+" is a palindrom");
		}
		else
		{
			System.out.println(s+" is not palindrom");
		}
	}

}
