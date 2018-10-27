/* WAP to check the biggest no. from given two no.s
	COMMAND LINE */

class Biggest 
{
	public static void main(String[] s) 
	{
		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);

		if(a>b)
			System.out.println(a+"is big");
		else if (a<b)
		{
			System.out.println(b+"is big");
		}
		else
			System.out.println("Both r equal");
	}
}
