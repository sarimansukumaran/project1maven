package oops;
class Parent1
{
	public void bank()
	{
		System.out.println("ICICI Bank");
	}
}
class Child1 extends Parent1
{

	@Override
	public void bank() {
		System.out.println("Indian Bank");
		super.bank();
	}
	
}

public class Methodoverriding {

	public static void main(String[] args) {
	  Child1 ob=new Child1();
		ob.bank();

	}

}
