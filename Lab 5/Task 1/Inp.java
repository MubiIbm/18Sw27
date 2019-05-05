import java.util.*;
class Inp
{
	public static void main (String args[])
	{
		int age;
		String name;
		float gpa;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Your Name = ");
		name=s.nextLine();
		System.out.print("Enter Your Age = ");
		age=s.nextInt();
		System.out.print("Enter Your GPA = ");
		gpa=s.nextFloat();
		System.out.print("Name = "+name+"\nAge = "+age+"\nGPA = "+gpa);

	}
	
}