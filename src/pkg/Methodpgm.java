package pkg;

import java.util.Scanner;

public class Methodpgm {

	public static void main(String[] args) {
		Methodpgm ob=new Methodpgm();
		ob.add();
		int ans=ob.sub();
		System.out.println(ans);
		ob.multi(10,30);
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter 2 numbers for division");
	    double a=sc.nextDouble();
	    double b=sc.nextDouble();
		double division=ob.div(a,b);
	    System.out.println(division);

	}
	//method without returntype and without parameter
	public void add()
	{
		int a=10,b=30,c;
		c=a+b;
		System.out.println(c);
	}
	//method with returntype and without parameter
	public int sub()
			{
				int  a=10,b=20,c;
				c=a-b;
				return c;
			}
	//method without returntype and with parameter
	public void multi(int a,int b)
	{
		
		int c=a*b;
		System.out.println(c);
	}
	//method with returntype and with parameter
	public double div(double a,double b)
	{
		double c=a/b;
		return c;
	}

}
