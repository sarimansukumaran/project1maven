package pgmquestions;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		System.out.println("Enter 5 numbers");
		Scanner sc=new Scanner(System.in);
		
		int[] ar=new int[5];
		int p=0;
		int n=0;
		int z=0;
		for(int i=0;i<5;i++)
		{
			
			ar[i]=sc.nextInt();
			if(ar[i]>0)
			{
               p++;
			}
			else if(ar[i]<0)
			{
				n++;
			}
			else
			{
				z++;
			}
			
		}
		System.out.println("Count of positive numbers are:"+p);
		System.out.println("Count of negitive numbers are:"+n);
		System.out.println("Count of zeros are:"+z);

	}

}
