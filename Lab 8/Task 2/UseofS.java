class Sport 
{
	public String getName()
	{
		return " Generic Sport ";
	}
	public void getNumberOfTeamMembers()
	{
		System.out.println("Each team has n Players = "+this.getName());
	}
}
class Cricket extends Sport
{
	public String getName()
	{
		return " Cricket Sport ";
	}
	public void getNumberOfTeamMembers()
	{
		System.out.println("Each team has n Players = "+this.getName());
	}
}
class Soccer extends Sport
{
	public String getName()
	{
		return " Soccer Sport ";
	}
	public void getNumberOfTeamMembers()
	{
		System.out.println("Each team has n Players = "+this.getName());
	}
}
class UseofS
{
	public static void main(String[] args) 
	{
		Soccer s1=new Soccer();
		s1.getNumberOfTeamMembers();
		Cricket c=new Cricket();
		c.getNumberOfTeamMembers();
	}
}