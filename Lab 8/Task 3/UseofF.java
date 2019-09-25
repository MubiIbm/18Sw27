class Final
{
	final public void demo()
	{
		System.out.println("This Final mehtod cant be overrided. ");
	}
}
class UseofF extends Final
{
	public void demo()
	{
		System.out.println("Final Override method Started.");
	}
	public static void main(String[] args) 
	{
		UseofF u=new UseofF();
		u.demo();
	}
}