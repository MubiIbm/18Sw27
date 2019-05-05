import java.util.*;
class Marksheet
{
	int oop,dcld,laag;
	int d=0;
	int e=0;
	Marksheet(int a,int b,int c)
	{
		oop=a;
		dcld=b;
		laag=c;
	}
	public void Total(){
		d=oop+laag+dcld;
		System.out.println("Total Marks Obtained out of 300 = "+(d));
	}
	public void Percent()
	{
		e=d*100/300;
		System.out.println("Percentage = "+e);
	}
	public void Grade()
	{
		if(e>=75)
		{
			System.out.println("Your Grade is A");
		}
		else if(e>=60&&e<75)
		{
			System.out.println("Your Grade is B");
		}
		else if(e>=50&&e<60)
		{
			System.out.println("Your Grade is C");
		}
		else{
			System.out.println("You are Fail");
		}
	}
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter OOP marks = ");
		a=s.nextInt();
		System.out.print("Enter DCLD marks = ");
		b=s.nextInt();
		System.out.print("Enter LAAG marks = ");
		c=s.nextInt();
		Marksheet m=new Marksheet(a,b,c);
		m.Total();
		m.Percent();
		m.Grade();
	}
}