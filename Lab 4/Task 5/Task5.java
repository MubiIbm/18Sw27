import java.util.*;
class Task5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int b=0;

		int []arra={1,54,2,9,399,3,11,4,5};
		for(int i=0;i<arra.length-1;i++)
		{
			if(arra[i]<arra[i+1])
			{	
				if(arra[i+1]>b)
				{
					b=arra[i+1];
				}
			}
		}
		System.out.print("Largest Number = "+b);
	}
}