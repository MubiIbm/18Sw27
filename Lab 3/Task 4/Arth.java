class Arth
{
	public static void main(String args[])
	{
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		char c=args[2].charAt(0);
		switch(c)
		{
			case '+':
			System.out.println("Your Sum = "+(a+b));
			break;
			case '-':
			System.out.println("Your Subtractio = "+(a-b));
			break;
			case '*':
			System.out.println("Your Product = "+(a*b));
			break;
			case '/':
			System.out.println("Your Division = "+(a/b));
			break;
			default:
			System.out.println("Wrong Commands given.");
			break;
		}
		
	}
}