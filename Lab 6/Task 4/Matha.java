class Matha{

	public void area(int l1){
		System.out.println("Area of Square = "+(l1*l1));
	}
	public void area(int l2,int w1){
		System.out.println("Area of Rectangle = "+(l2*w1));
	}
	public static void main(String args[]){
		Matha m=new Matha();
		m.area(5);
		m.area(3,5);
	}
}