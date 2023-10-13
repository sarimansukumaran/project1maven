package oops;
class Abc
{
	

private String name;
private String designation;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public class Encapsulation {
}

	public static void main(String[] args) {
		Abc ob=new Abc();
		ob.setName("sarima");
		System.out.println(ob.getName());
		

	}

}
