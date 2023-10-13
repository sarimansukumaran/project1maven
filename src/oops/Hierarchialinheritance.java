package oops;
// Hierarchial inheritance Hierarchialinheritance
class Animal1
{
	public void animalfood()
	{
		System.out.println("Animal food");
	}
}
class Domesticanimal extends Animal1
{
	public void cat()
	{
		System.out.println("Cat is a domestic animal");
	}
}
class Wildanimal extends Animal1
{
	public void tiger()
	{
		System.out.println("Tiger is a wild animal");
	}
}


public class Hierarchialinheritance {

	public static void main(String[] args) {
		Domesticanimal ob=new Domesticanimal();
		ob.animalfood();
		ob.cat();
		Wildanimal ob1=new Wildanimal();
		ob1.animalfood();
		ob1.tiger();
		
	}

}
