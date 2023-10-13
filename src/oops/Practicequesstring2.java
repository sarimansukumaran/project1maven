package oops;

import java.util.Scanner;

public class Practicequesstring2 {

	public static void main(String[] args) {
		System.out.println("Enter 5 number");
        Scanner sc=new Scanner(System.in);
       
		
		int[] ar=new int[5];
		 for(int i=0;i<5;i++)
		 {
			 ar[i]=sc.nextInt();
		 }
		 
		 for(int i=1;i<5;i++)
		 {
		  for(int j=i+1;j<5;j++)
		  {
			if(ar[i]==ar[j])
					{
			  System.out.println("Duplicate elements of array is:"+ar[j]);
		  }
		 
		  }

}
}
}
