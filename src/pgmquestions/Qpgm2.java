package pgmquestions;
class Vehicle
{
	public void drive()
	{
		System.out.println("Repairing");
	}
}
class Car extends Vehicle
{

	@Override
	public void drive() {
		System.out.println("Repairing a car");
		super.drive();
	}
 
}

public class Qpgm2 {

	public static void main(String[] args) {
		Car ob=new Car();
		ob.drive();
	
	}

}
