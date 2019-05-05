import java.util.*;
class arr
{
	int ad;
	Scanner sc=new Scanner(System.in);
	int []pop=new int[ada()];

	int c;
	public int ada()
	{
		System.out.print("Enter Number of elements for Array = ");
		ad=sc.nextInt();
		return ad;
	}
	public int stor(int a)
	{
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		return a;

	}
	public void rar()
	{

		for(int i=0;i<pop.length;i++)
		{
				System.out.print("Enter array's "+(i+1)+" element's Value = ");
				pop[i]=stor(c);
		}
		System.out.println("Array Data Stored In Memory :-");
		for(int k=0;k<pop.length;k++)
		{
			System.out.println("Array["+k+"] = "+pop[k]);
		}
	}
	public static void main(String args[])
	{
		arr r=new arr();
		r.rar();
	}
}


