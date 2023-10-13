package oops;
//multilevel inheritance
class Animal
{
	public void animalFood()
	{
		System.out.println("Animal food");
	}
}
class Dog extends Animal
{
	public void dogType()
	{
		System.out.println("German shepard");
	}
}
class Babydog extends Dog
{
	public void babyDogs()
	{
		System.out.println("baby dogs");
	}
}

public class Multilevelinhritance {

	public static void main(String[] args) {
		Babydog ob=new Babydog();
		ob.animalFood();
		ob.dogType();
		ob.babyDogs();
	}

}
