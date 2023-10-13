package pkg;

public class Operatorspgm {

	public static void main(String[] args) {
		//Arithmetic Operators
		int a=20,b=10;
		System.out.println("-----ARITHMETIC OPERATORS------");
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));//quotient
		System.out.println("a%b="+(a%b));//reminder
		
		//Assignment operators
		
		System.out.println("------ASSIGNMENT OPERATORS------");
		System.out.println(a+=b);//a=a+b
		System.out.println(a-=b);//a=a-b
		System.out.println(a/=b);//a=a/b
		System.out.println(a*=b);
		
		
		//Relational Operators
		
		int c=55,d=79;
		System.out.println("------RELATIONAL OPERATORS--------");
		System.out.println(c<d);
		System.out.println(c>d);
		System.out.println(c<=d);
		System.out.println(c>=d);
		System.out.println(c==d);
		System.out.println(c!=d);
		
		//Logical Operators
		
		System.out.println("-------LOGICAL OPERATORS---------");
	String fname="sarima";
	String lname="ns";
	
	System.out.println(fname=="sarima1" && lname=="ns");
	System.out.println(fname=="sarima" || lname=="ns");
	System.out.println(!(fname=="sarima"));
	
	//Unary operators
	
	System.out.println("--------UNARY OPERATORS---------");
	
	int e=10;
	System.out.println(e++);//increment by 1
	System.out.println(e);
	System.out.println(++e);
	
	int e1=5;
	System.out.println(e1--);//decrement by 1
	System.out.println(e1);
	System.out.println(--e1);
	
	//Ternary Operator
	
	System.out.println("------Ternary Operators-------");
	int num1=20,num2=15;
	int value=num1>num2?num1:num2;
	System.out.println(value);
		
	String v=num1>num2?"Num1 is greater":"Num2 is greater";
	System.out.println(v);


	}

}
