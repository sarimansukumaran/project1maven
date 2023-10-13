package pkg;

public class Qpalindrom {

	public static void main(String[] args) {
		
		int n=231;
		int temp=n;
		int r;
		int s=0;
		while(n>0)
			{   
			r=n%10; //1       3           2
			s=s*10+r;// 1    10+3=13   13*10+2=132 
			n=n/10;//23       2         0
			}
		System.out.println(s);
		if(temp==s)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not palindrom");
		}
	}

}
