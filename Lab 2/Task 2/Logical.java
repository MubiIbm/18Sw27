class Logical
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(a>b&&b>=0)
		{
			System.out.println("The Greatest Number is = "+a);
		}
		else if(b>a&&a>=0)
		{
			System.out.println("The Greatest Number is = "+b);
		}
		else{
			System.out.println("Both are equal");
		}
	}
}