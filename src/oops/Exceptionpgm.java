package oops;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args)  {
	//	FileInputStream ob=new FileInputStream("e://book1.lsx");
		try
		{
		int a=10,b=0;
		double c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
			System.out.println(e.getMessage());
		}
		System.out.println("hello");
		
		
		int[] ar=new int[2];
		ar[0]=23;
		try
		{
			
		System.out.println(ar[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index ot of bound Exception");
			System.out.println(e.getMessage());
		}
	}

}
