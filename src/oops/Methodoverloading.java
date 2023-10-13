package oops;

public class Methodoverloading {
	

	public static void main(String[] args) {
		

	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add()
	{
		System.out.println("adding");
	}
	public void add(float a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a, float b)
	{
		System.out.println(a+b);
	}

}