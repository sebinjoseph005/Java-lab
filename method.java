import java.util.Scanner;
class MArea{
	void Area(double rad)
	{
		System.out.println("area of circle="+3.14*rad*rad);
	}
	void Area (double base,double height)
	{
		System.out.println("area of triangle="+0.5*base*height);
	}
	void Area (int length,int breadth)
	{
	System.out.println("area of rectangle="+length*breadth);
	
	}
}
class method
{
	public static void main(String[] args)
	{
		MArea ar=new MArea();
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the radius");
		double x=sc.nextDouble();
		ar.Area(x);
		System.out.println("enter base and height");
		double y=sc.nextDouble();
		double z=sc.nextDouble();
		ar.Area(y,z);
		System.out.println("enter the length and breadth");
		int a=sc.nextInt();
		int b=sc.nextInt();
		ar.Area(a,b);
	}
}