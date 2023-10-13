package oops;

abstract class Car
{
	abstract public void accelaration();
	abstract public void speedLimit();
	public void milage()
	{
		System.out.println("car milage");
	}
}
class BMW extends Car
{

	@Override
	public void accelaration() {
		System.out.println("Car accelaration");
		
	}

	@Override
	public void speedLimit() {
		System.out.println("High speed limit");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		BMW ob=new BMW();
		ob.accelaration();
		ob.speedLimit();
		ob.milage();

	}

}
