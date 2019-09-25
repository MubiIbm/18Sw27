class Bauth
{
	private String name;
	private String email;
	private char gender;
	public Bauth(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public String toString()
	{
		return ("Name = "+name+"\nEmail = "+email+"\nGender = "+gender);
	}
	public static void main(String args[])
	{
		Bauth b=new Bauth("Mubashir","mubashirkhan786bhai@gmail.com",'m');
		System.out.print(b.toString());

	}
}