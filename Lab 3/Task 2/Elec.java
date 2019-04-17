import java.util.*;
class Elec
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a;
		double billpay=0;
		System.out.print("Enter Your Number of Units = ");
		a=s.nextInt();
		if(a<=50)
		{
			billpay=((a*10));
		}
		else if(a>50&&a<=100)
		{
			billpay=(50*10+(a-50)*15);
		}
		else if(a>100&&a<=200)
		{
			billpay=((50*10+(50*15)+(a-100)*20));
		}
		else if(a>200&&a<=300)
		{
			billpay=(50*10+50*15+100*20+(a-200)*25);
		}
		else if(a>300){
			billpay=(50*10+50*15+100*20+100*25+(a-300)*30);
		}
		System.out.println("Your Bill is "+billpay);
	}
}