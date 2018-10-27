//Write a program to perform operations on String buffer =(Mutable)

class stringbuffer 
{
	public static void main(String[] s) 
	{
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		sb.append("How r u");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.delete(6,11));
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		System.out.println(sb.insert(1,"bye"));
		System.out.println(sb.length());
		System.out.println(sb.replace(4,6,"hi"));
		String a=sb.toString();
		sb.append("pqr");
		System.out.println(a);
		System.out.println(sb.substring(4,9));
	}
}
