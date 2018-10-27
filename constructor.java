//WAP to create default constructor in inheritance

class First 
{
	First()
	{
		System.out.println("First class Constructor");
	}
}
class second extends First
{
	second()
	{
		System.out.println("Second class Constructor");
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
