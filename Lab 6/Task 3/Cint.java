class Cint{

	public void print(int n,char ch){
		System.out.println("Number  =  "+n+" character  =  "+ch);
	}
	public void print(char ch1,int n1){
		System.out.println("Number  =  "+n1+" character  =  "+ch1);
	}
	public static void main(String args[]){
		Cint c=new Cint();
		
		c.print(1,'a');
		
		c.print('z',54); 
	}
}