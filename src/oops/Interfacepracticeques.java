package oops;

interface BasicAnimal
{
	public void eat();
	public void sleep();
}

class Monkey 
{
	public void jump()
	{
		System.out.println("jump");
	}
	public void bite()
	{
		System.out.println("bite");
	}
	
	
}
class Human extends Monkey implements BasicAnimal
{
	public void speak()
	{
		System.out.println("speak");
	}
	@Override
	public void eat() {
		System.out.println("eat");
		
	}
	@Override
	public void sleep() {
		System.out.println("sleep");
		
	}
	
}

public class Interfacepracticeques {

	public static void main(String[] args) {
		
		Human ob=new Human();
		ob.bite();
		ob.jump();
		ob.eat();
		ob.sleep();
		ob.speak();

	}

}
