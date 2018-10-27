//Write a program for method overloading

class  funover
{
	void abc(int p)
	{
		System.out.println("Integer value is :"+p);
	}
	void abc(float b)
	{
		System.out.println("Float value is :"+b);
	}
	void abc(double b)
	{
		System.out.println("Double value is :"+b);
	}
	void cal(float p1,double t1,double r1)
	{
		System.out.println("First is executed");
		double r=p1*t1*r1;
		double is=r/100;
		System.out.println("Simple Interest:"+is);
	}
	void cal(int p2,double t2)
	{
		System.out.println("Second is executed");
		double r2=1.5;
		double r=p2*t2*r2;
		double is=r/100;
		System.out.println("Simple Interest:"+is);
	}
	void cal(double p2,double t2)
	{
		System.out.println("Third is executed");
		double r2=1.5;
		double r=p2*t2*r2;
		double is=r/100;
		System.out.println("Simple Interest:"+is);
	}
	public static void main(String s[])
	{
		funover fn=new funover();
		fn.cal(120,2,51);
		fn.cal(152,2e3);
		fn.cal(10,2.5f);
		fn.cal(18,2);
		fn.cal(2.7f,8);
		fn.abc(5.2f);
		fn.abc(50);
		fn.abc(3e3);
		fn.abc(10.7);
	}
}
