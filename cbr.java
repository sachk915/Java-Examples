// WAP to pass object as an argument

class cbr 
{
	int a,b;
	void read(int x,int y)
	{
		a=x;
		b=y;
	}
	void swap(cbr p)
	{
		int t=p.a;
		p.a=p.b;
		p.b=t;
	}
	void display()
	{
		System.out.println(a+" "+b);
	}
	public static void main(String s[])
	{
		cbr c1=new cbr();
		int a1=Integer.parseInt(s[0]);
		int a2=Integer.parseInt(s[1]);
		c1.read(a1,a2);
		System.out.println("Before Swap");
		c1.display();
		System.out.println("After Swap");
		c1.swap(c1);
		c1.display();
	}
}
