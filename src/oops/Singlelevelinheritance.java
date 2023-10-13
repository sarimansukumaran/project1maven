package oops;
//Single level inheritance
class Parent
{
	int a=10;
	int b=20;
	public void add()
	{
		int d=a+b;
		System.out.println("Sum of a+b="+d);
	}
}
class Child extends Parent
{
	public void sub()
	{
		int c=b-a;
		System.out.println("Sub of a-b="+c);
	}
}

public class Singlelevelinheritance {

	public static void main(String[] args) {
		Child ob=new Child();
		ob.add();
		ob.sub();
		System.out.println("a="+ob.a);
		System.out.println("b="+ob.b);
		
	}

}
