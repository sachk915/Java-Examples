/*	WAP a program for switch case 
	using COMMAND LINE	 */

class  Switch
{
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		switch(n)
		{
			case 1:System.out.println("one");
			break;
			case 2:System.out.println("two");
			break;	
			case 3:System.out.println("three");
			break;
			case 4:System.out.println("four");
			break;
			case 5:System.out.println("five");
			break;
			default:System.out.println("Invalid Choice");
		}
	}
};
