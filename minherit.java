// WAP for multilevel inheritance
 
class  studinfo
{
	
	int rollno;
	String name;
	int m1,m2,m3;
	    
	void getdetails(int r, String na)
	{
		rollno=r;
		name=na;
		
	}
}
 class studmarks extends studinfo
{
	
	void getmarks(int p,int q,int r)
	{
		m1=p;
		m2=q;
		m3=r;
	}
	void details()
	{
		System.out.println("Roll no is:"+rollno);
		System.out.println("Name is:"+name);
		System.out.println("Marks are :");
		System.out.println("m1="+m1);
		System.out.println("m2="+m2);
		System.out.println("m3="+m3);
	}
}
 class studdetails extends studmarks
{
	void showdetails()
	{
		details();
		System.out.println("total="+(m1+m2+m3));
		System.out.println("average="+((m1+m2+m3)/3));
	}
}
class minherit
{
	public static void main(String s[])
	{
		int x1=Integer.parseInt(s[0]);
		String x2=s[1];
		int x3=Integer.parseInt(s[2]);
		int x4=Integer.parseInt(s[3]);
		int x5=Integer.parseInt(s[4]);
		studdetails ob=new studdetails();
		ob.getdetails(x1,x2);
		ob.getmarks(x3,x4,x5);
		ob.showdetails();
	}
}