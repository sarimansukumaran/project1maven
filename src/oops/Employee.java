package oops;
//constructor
public class Employee {
	int empid;
	String empname;
	int empage;
	String empdesignation;
	public Employee(int empid,String empname,int empage,String empdesignation)
	{
	this.empid=empid;
	this.empname=empname;
	this.empage=empage;
	this.empdesignation=empdesignation;
	}
	public void display()
	{
		System.out.println("empid="+empid);
		System.out.println("empname="+empname);
		System.out.println("empage="+empage);
		System.out.println("empdesignation="+empdesignation);

	}
	

	public static void main(String[] args) {
		Employee em1=new Employee(101,"alna",23,"tester");
		em1.display();
		Employee em2=new Employee(102,"sarima",25,"HR");
		em2.display();
		
	}

}
