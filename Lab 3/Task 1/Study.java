import java.util.*;
class Study
{
	public static void main(String args[])
	{
		Scanner s = new Scanner (System.in);
		float a,b,c,d,e;
		System.out.print("Enter Marks in C++ = ");
		a=s.nextFloat();
		System.out.print("Enter Marks in Data Structures = ");
		b=s.nextFloat();
		System.out.print("Enter Marks in Operating System = ");
		c=s.nextFloat();
		d=a+b+c;
		e=(d/300)*100;
		System.out.println("Your Total Marks out of 300 are = "+d);
		System.out.println("Your Percentage is = "+e);
		if(e>90)
		{
			System.out.println("Your Grade is A");
		}
		else if(e>80&&e<=90)
		{
			System.out.println("Your Grade is B");
		}
		else if(e>70&&e<=80)
		{
			System.out.println("Your Grade is C");
		}
		else if(e>60&&e<=70)
		{
			System.out.println("Your Grade is D");
		}
		else{
			System.out.println("Sorry You are Fail");
		}

	}
}