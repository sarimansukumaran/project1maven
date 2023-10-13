package pkg;

import java.util.Scanner;

public class Stringvowels {

	public static void main(String[] args) {
		System.out.println("Enter a word");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		vowelCount(s);
	}
	public static void vowelCount(String s) {
		
	
	
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
					
				count++;
				
			}
			
		}
		System.out.println(count);
}
	

}
