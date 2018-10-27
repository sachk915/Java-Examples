//WAP for hiearchial inheritance

class info
{
	int a,b;
	void get(int p,int q)
	{
		this.a=p;
		this.b=q;
	}
	
}
class add extends info 
{
	void add()
	{
		System.out.println("Add is :"+(a+b));
	}

}
class sub extends info 
{
	void sub()
	{
		System.out.println("Sub is :"+(a-b));
	}
}
class mult extends info 
{
	void mult()
	{
		System.out.println("mult is :"+(a*b));
	}
}
class div extends info 
{
	void div()
	{
		System.out.println("Div is :"+(a/b));
	}
}
class hinherit
{
	public static void main(String s[])
	{
		int n1=Integer.parseInt(s[0]);
		int n2=Integer.parseInt(s[1]);
		add ad=new add();
		sub sb=new sub();
		mult mu=new mult();
		div dv=new div();
		ad.get(n1,n2);
		sb.get(n1,n2);
		mu.get(n1,n2);
		dv.get(n1,n2);
		ad.add();
		sb.sub();
		mu.mult();
		dv.div();
	}
}


