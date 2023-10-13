package pkg;

public class Jumpingstmts {

	public static void main(String[] args) {
		System.out.println("---------break--------");
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("-----continue------");
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("-------return---------");
		
		System.out.println(sum());
		
		
	}
	public static int sum() 
	{
		int a=20,b=10,c;
		c=a+b;
		return c;
	}

}
