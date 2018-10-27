/* Write a program to create inner class with members,access
	those members outside of the outer class */

class atall 
{
	student ob=new student();
	void getdetails(int id,String na)
	{
		ucode=id;
		name=na;
	}
	void print()
	{
		System.out.println("University code="+ucode);
		System.out.println("University name="+name);
	}
	public class student
	{
		int stno;
		String na;
		void get(int no,String sna)
		{
			stno=no;
			na=sna;
		}
		void put()
		{
			System.out.println("Student Number="+stno);
			System.out.println("Student Name="+na);
		}
	}
	private int ucode;
	String name;
}
class inner
{
	public static void main(String s[])
	{
		class atall obj=new class atall();
		obj.getdetails(Integer.parseInt(s[0]),s[1]);
		obj.print();
		obj.ob.get(Integer.parseInt(s[2]),s[3]);
		obj.ob.put();
	}
}
