
class final1
{
	final int p=7;
	final void show()
	{
		System.out.println("First show method 1");
	}
}
final class final2 extends final1
{
	void show(int x)
	{
		System.out.println("Second show method 2"+x);
		x=p+10;
		System.out.println("Second show method 2 "+(++x));
	}
}
class constants
{
	public static void main(String s[])
	{
		final2 x=new final2();
		x.show();
		x.show(10);
	}
}
