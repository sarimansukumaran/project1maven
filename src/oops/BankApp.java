package oops;

import java.util.Scanner;

interface Bank
{
	public void accountDetails(String name);
	void accountDetails();
	public void balance();
	public void deposit();
	public void withdrawal();
}
class SBI implements Bank
{

	static String bankname="SBI";
	int accountno;
	int balance=10000;
	String name;
	Scanner sc=new Scanner(System.in);
	@Override
	public void accountDetails() {
		System.out.println("Enter Bank name"+bankname);
		System.out.println("Enter your name"+name);
		System.out.println("Enter AccountNo: "+accountno);
		accountno=sc.nextInt();
		System.out.println("Banlance:"+balance);
		
		
	}

	@Override
	public void balance() {
		System.out.println("Your balance is "+balance);
		
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter your deposit amount ");
		int deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("Balance:"+balance);
		
	}

	@Override
	public void withdrawal() {
		System.out.println("Enter your withdrawal amount ");
		int withdrawal=sc.nextInt();
		balance=balance-withdrawal;
		System.out.println("Balance "+balance);
	}

	@Override
	public void accountDetails(String name) {
		// TODO Auto-generated method stub
		
	}
	
}
public class BankApp {

	public static void main(String[] args) {
		
		SBI ob=new SBI();
		ob.accountDetails("sarima");
		ob.balance();
		ob.deposit();
		ob.withdrawal();

	}

}
