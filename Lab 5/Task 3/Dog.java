import java.util.*;
class Dog
{
	String name,breed;
	int age;
	public void setDetails(String a,String b,int c)
	{
		name=a;
		breed=b;
		age=c;
	}
	public void showDetails()
	{
		System.out.println("***Dog Information***");
		System.out.print("Name = "+name+"\nBreed Name = "+breed+"\nAge = "+age+" years");
	}
	public static void main(String args[])
	{
		Dog g=new Dog();
		
		String d,e;
		int f;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Dog Name = ");
		d=s.nextLine();
		System.out.print("Enter Its Breed Name = ");
		e=s.nextLine();
		System.out.print("Enter its Age = ");
		f=s.nextInt();
		g.setDetails(d,e,f);
		g.showDetails();
	}
}