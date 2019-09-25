class Pers
{
	private String name;
	private String address;
	Pers(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String toString()
	{
		return " Person[name = "+name+" , address = "+address+"]";
	}
}
class Stud extends Pers
{
	private String program;
	private int year;
	private double fee;
	Stud(String name,String address,String program,int year,double fee)
	{
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public void setProgram(String program)
	{
		this.program=program;
	}
	public String getProgram()
	{
		return program;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return year;
	}
	public void setFee(double fee)
	{
		this.fee=fee;
	}
	public double getFee()
	{
		return fee;
	}
	public String toString()
	{
		return "Student["+super.toString()+",program = " +program+",year = "+year+",fee = "+fee+"]";
	}
}
class Staf extends Pers
{
	private String school;
	private double pay;
	Staf(String name,String address,String school,double pay)
	{
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	public void setSchool(String school)
	{
		this.school=school;
	}
	public String getSchool()
	{
		return school;
	}
	public void setPay(double pay)
	{
		this.pay=pay;
	}
	public double getPay()
	{
		return pay;
	}
	public String toString()
	{
		return "Staff [ "+super.toString()+" , school = "+school+" , pay = "+pay+" ] " ;
	}
}
class Unisys
{
	public static void main(String[] args) 
	{
		Stud s=new Stud("Mubashir Ibrahim ","Mehran Hostel "," (B.E) ",2018,32000);
		Staf s1=new Staf("Babar ali Memon "," Mehran Hostel "," Government High School Haji Pir Bux Rajar ",0.0);
		System.out.println(s);
		System.out.println(s1);
	}
}