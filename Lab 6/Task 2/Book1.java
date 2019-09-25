class Au{
	private String name;
	private String email;
	private char gender;
	Au(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getName(){
		return name;
	}


	public String getEmail(){
		return email;

	}
	public char getGender(){
		return gender;
	}
	public String toString(){

		return ("Authur[name="+getName()+", email="+getEmail()+", gender="+getGender()+"]\n");
	}
}
class Book{
	private String name;
	
	private Au author[];


	private double price;
	
	private int qty;
	public Book(String name,Au[] author,double price){
		this.name=name;
		this.author=author;
		this.price=price;
	}
	public Book(String name,Au[] author,double price,int qty){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public void setQty(int qty){
		this.qty=qty;
	}
	public String getName(){
		return name;
	}
	public Au[] getAu(){
		return author;
	}

	public double getPrice(){
		return price;
	}


	public int getQty(){
		return qty;
	}
	public String toString(){
		String b="";
		for(int i=0;i<author.length;i++){
			if(i==author.length-1)
				b+=author[i].toString();
			else
				b+=author[i].toString()+",";
		}
	return ("Book[name="+getName()+",authors={"+b+"}, price="+getPrice()+", qty="+getQty()+"]\n");
	}
	public String getAuNames(){
		String a="";
		for(int i=0;i<author.length;i++){
			if(i==author.length-1)
				a+="Author"+(i+1)+"="+author[i].getName();
			else
				a+="Author"+(i+1)+"="+author[i].getName()+",";
		}
		return a;
	}

}
class Book1{

	public static void main(String args[]){

		Au au=new Au("  Mubashir  "," mubashirkhan786bhai@gmail.com ",'M');
		
		Au au1=new Au(" mubashir ","mubashirkhan786bhai@gmail.com ",'M');
		Au author[]={au,au1};
		Book ab=new Book("Obstacles of Life ", author,390,8);
		System.out.println(ab.toString());

		System.out.println(ab.getAuNames());
	}
}