
class First 
{
	First()
	{
		System.out.println("First class Constructor 1");
	}
}
class second extends First
{
	second()
	{
		System.out.println("Second class Constructor 2");
	}
}
public class constructor
{
	public static void main(String s[])
	{
		second ob[] =new second[5];
		for (int i=0;i<ob.length;i++ )
		{
			ob[i]=new second();
		}
	}
}
