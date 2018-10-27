//WAP for parameterized constructor

class con2
{
	double r,h,b;
	con2()
	{
		System.out.println("Default Constructor invoked");
		h=10;
		b=20;
	}
	con2(double i,float k)
	{
		h=i;
		b=k;
		System.out.println("Parameterized constructor executed");
	}
	void area()
	{
		r=(b*h)/2;
		System.out.println("Area is="+"\t"+r);
	}
	public static void main(String s[])
	{
		con2 c=new con2();
		c.area();
		con2 c1=new con2(4e2,3.2f);
		c1.area();
		con2 obj=new con2(10,10);
		obj.area();
	}
}
