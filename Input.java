/* Write a program to read the inputs from command line */

class  Input
{
	public static void main(String[] a) 
	{
		int x1=Integer.parseInt(a[0]);
		float x2=Float.parseFloat(a[1]);
		String name=a[2];
		
		System.out.println("Name="+name);
		System.out.println("Sum is="+(x1+x2));

		double d=Double.parseDouble(a[3]);
		System.out.println("Double value is"+d);
	}
}
