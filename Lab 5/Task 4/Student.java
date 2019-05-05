import java.util.*;
class Student
{
	String name;
	String rollno;
	int age;
	Student(String a,String b,int c)
	{
		this.name=a;
		this.rollno=b;
		this.age=c;
	}
	public void getInfo()
	{
		System.out.println("\n***Student Info***\n");
		System.out.print("Name : "+name+"\nRoll Number : "+rollno+"\nAge : "+age);
	}
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		String d,e;
		int f;
		System.out.print("Enter Student Name : ");
		d=s.nextLine();
		System.out.print("Enter Roll Number : ");
		e=s.nextLine();
		System.out.print("Enter His Age : ");
		f=s.nextInt();
		Student st=new Student(d,e,f);
		st.getInfo();

	}

}