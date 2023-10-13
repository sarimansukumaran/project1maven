package oops;
interface calc
{

	public void add();
	public void sub();
}
interface Advancecalc
{
	public void div();
}
class Simplecalculator implements calc,Advancecalc
{

	@Override
	public void add() {
		System.out.println("Addition");
		
	}

	@Override
	public void sub() {
		System.out.println("Substration");
	}

	@Override
	public void div() {
		System.out.println("Division");
		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		Simplecalculator ob=new Simplecalculator();
		ob.add();
		ob.sub();
		ob.div();

	}

}