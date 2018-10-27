//WAP for default constructor

class conect 
{
	static int i=10;
	void conect()
	{
		System.out.println("Default Constructor invoked"+i++);
	}
	static void show()
	{
		System.out.println(i++);
	}
}
class con1
{
	public static void main(String s[])
	{
		conect c1[]=new conect[5];
		for(int i=0;i<c1.length;i++)
			c1[i]=new conect();
		for(int i=0;i<c1.length;i++)
			c1[i].show();
	}
}
