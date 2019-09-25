class St{
	private String name;
	private int age;
	private String address;
	public St(){
		name="unknown";
		age=0;
		address="not available";
	}
	public void setInfo(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void print(){
		System.out.println("Name  = "+name);
		System.out.println("Age  = "+age);
		System.out.println("Address  = "+address);
	}
}
class Student
{
	public static void main(String args[]){
		St s=new St();
		s.setInfo(" Mubashir ",15);
		St s1=new St();
		s1.setInfo("babar",19);
		St s2=new St();
		s2.setInfo("Yasir bhatti ",18," Badin ");
		St s3=new St();
		s3.setInfo(" Talha ",17," Badin");
		St s4=new St();
		s4.setInfo("Umesh ",21,"Sujawal ");
		St s5=new St();
		St s6=new St();

		St s7=new St();
		St s8=new St();
		St s9=new St();
		St student[]={s,s1,s2,s3,s4,s5,s6,s7,s8,s9};
		for(int i=0;i<student.length;i++){
			student[i].print();
			System.out.println();
		}

	}
}