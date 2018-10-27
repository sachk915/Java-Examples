/* WAP to create single dynamic single dimensional 
	array ,assign the values into that array and 
	print those values */

class Array 
{
	public static void main(String[] args) 
	{
		int size=Integer.parseInt(args[0]);
		int []a=new int[size];

		for(int i=0;i<a.length;i++)
			a[i]=Integer.parseInt(args[i+1]);

		System.out.println("Array Elements are");

		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}

/*
	Syntax :
	
	static Array:
	datatype identifier []={val1,v1l2......,valn};

	Dynamic Array:
	datatype []identifier=new datatype[size];

*/