package pgmquestions;

import java.util.Scanner;

public class Q1array {

	public static void main(String[] args) {
		
		System.out.println("Enter 5 number");
        Scanner sc=new Scanner(System.in);
       
		
		int[] ar=new int[5];
		 for(int i=0;i<5;i++)
		 {
			 ar[i]=sc.nextInt();
		 }
		 int lar=ar[0];
		 for(int i=1;i<5;i++)
		 {
		  if(lar<ar[i])
		  {
			
				lar=ar[i];  
		  }
		
			 
		
	}
		  System.out.println(lar);
			
	}
}
