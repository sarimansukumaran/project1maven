package pkg;

public class Shapespgm {

	public static void main(String[] args) {
		Shapespgm ob=new Shapespgm();
		ob.rectangle();
		double ans=ob.circle();
		System.out.println(ans);
		ob.triangle(10,20);
		double result=ob.square(10);
		System.out.println(result);

	}
	//methods without retrurntype and without parameters
	public void rectangle()
	{
		int l=10,b=3;
		int  rect=l*b;
		System.out.println(rect);
	}
	//methods with returntype and without parameter
	public double circle()
	{
		double r=10;
		double cir=3.14*r*r;
		return cir;
	}
	//method without returntype and with parameter
		public void triangle(double b,double h)
		{
			double tri=0.5*b*h;
			System.out.println(tri);
		}
		//method with returntype and with parameter
		public double square(double a)
		{
			double squ=a*a;
			return squ;
		}

}
