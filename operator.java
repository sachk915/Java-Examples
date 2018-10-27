/* Write a program to perform the following operations by using
	OPERATOR	*/

class  operator
{
	public static void main(String[] args) 
	{
		int a=15,b=5;
		a%=2;
		System.out.println(a);
		System.out.println(a++-++a);
		System.out.println(a);
		boolean x=(a>2)&&(b>5);
		System.out.println(x);
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a<<2);
		System.out.println(a>b?a:b);
	}
}
