//WAP for method overloading

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
		fn.cal(1200,2,5);
		fn.cal(1e2,2e3);
		fn.cal(12,2.5f);
		fn.cal(10,2);
		fn.cal(2.5f,8);
		fn.abc(5.6f);
		fn.abc(100);
		fn.abc(3e2);
		fn.abc(10.6);
	}
}
