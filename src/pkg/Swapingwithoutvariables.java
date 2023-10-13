package pkg;

public class Swapingwithoutvariables {

	public static void main(String[] args) {
		int a=10,b=55;
		System.out.println("Before swaping value of a="+a+" and value of b="+b);
		a=a+b; //55+10=65
		b=a-b; //65-55=10
		a=a-b; //65
		System.out.println("After swaping vale of a="+a+" and value of b="+b);

	}

}
