import java.util.*;
class Task2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,i;
	System.out.print("Enter th Number you want to print Table of = ");
	a=sc.nextInt();
	System.out.print("Enter from where you want to start table = ");
	i=sc.nextInt();
	System.out.print("Enter the Number where Table ends = ");
	b=sc.nextInt();
	for ( ;i<=b;i++)

	{
		System.out.println(a+" x "+i+" = "+a*i);
	}
	}
}