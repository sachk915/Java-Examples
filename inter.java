//Write a program for interface

interface PQ
{
	void pqr();
}
interface X
{
	public final static int a=100;
	public abstract void abc();
}
interface Y extends PQ,X
{
	void xyz();
}
class inter implements Y
{
	float a=11.5f;
	public void xyz()
	{
		System.out.println(a);
		System.out.println(X.a);
	}
	public void pqr()
	{
		System.out.println("Hello....");
	}
	public void abc()
	{
		System.out.println("Bye...");
	}
	public static void main(String s[])
	{
		inter obj =new inter();
		obj.xyz();
		obj.abc();
		obj.pqr();
	}
}
