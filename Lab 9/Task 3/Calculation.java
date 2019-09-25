
class Calculation
{
	int result=1;
	public long power(int n,int p)
	{
		try
		{
			if (n<0 || p<0) 
			{
				throw new Exception("n and p should not negative Number");
			}
			else if (n==0||p==0) 
			{
				throw new Exception("n and p should not zero");
			}
			else 
			{
				for (int i=1;i<=p;i++) 
				{
					result*=n;
				}
			}
		}catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
			return result;
	}
	public static void main(String[] args) 
	{
		Calculation cal=new Calculation();
		System.out.println(cal.power(4,9));
	}
}