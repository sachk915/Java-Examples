//Write a program to perform the operations on String(inmutable)
class  strings
{
	public static void main(String[] args) 
	{
		char a[]={'h','e','l','l','o'};
		String x=new String(a);
		System.out.println(a);
		String y="ABCD";
		String z="Abcd";
		System.out.println(y.compareTo(z));
		System.out.println(y.equals(z));
		System.out.println(y.equalsIgnoreCase(z));

		y=y.concat("xyz");
		System.out.println(y.length());
		y=y.trim();
		System.out.println(y);
		System.out.println(y.length());
		System.out.println(y.toLowerCase());
		System.out.println(x.toUpperCase());
		System.out.println(y.substring(3));
		System.out.println(y.substring(2,6));
		System.out.println(y.endsWith("yz"));
		System.out.println(x.replace('l','n'));

		byte b[]=y.getBytes();
		for (int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		char c[]=y.toCharArray();
		for (int i=0;i<c.length ;i++ )
		{
			System.out.println(c[i]);
		}
		System.out.println(c);
	}
}
