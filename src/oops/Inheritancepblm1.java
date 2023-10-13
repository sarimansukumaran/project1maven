package oops;
class Member
{
	String name;
	int age;
	int phoneno;
	String address;
    int salary;
	
	public void printDetails(String name,int age,int phoneno,String address,int salary)
	{
		System.out.println("Member name: "+name);
		System.out.println("Member age :"+age);
		System.out.println("Phone no :"+phoneno);
		System.out.println("Address :"+address);
		System.out.println("Salary :"+salary);
	}
}
class Employee1 extends Member
{
	
	String specialization;
}
class Manager extends Member
{
	String department;
	
}
class Inheritancepblm1 {

	public static void main(String[] args) {
		Employee1 ob=new Employee1();
		ob.printDetails("sarima",25,75446585,"jgfjgdfjgd",23000);
		System.out.println(ob.specialization="java");
		Manager ob1=new Manager();
		ob.printDetails("alna",30,7644876,"jgfjgfjgf",50000);
		System.out.println(ob1.department="tester");
	}

}
