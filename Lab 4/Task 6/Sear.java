import java.util.*;
class Sear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b=0;
		int []arr={1,2,3,52,6,9};
		System.out.print("Enter Number to Find = ");
		a=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(a==arr[i])
			{
				count++;
				b=i;	
			}
		}
		if(count==1)
		{
			System.out.print("Number Found At Index = arr["+b+"]");
		}
		else{
				System.out.print("Number Not Found");
			}
	}
}