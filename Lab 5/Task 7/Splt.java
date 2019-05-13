class Splt
{
	public static void main(String args[])
	{
		String info1 ="Ayesha,18,BE-Software";
		String info2 ="Ali,19,BE-Electronics";
		String[] parts = info1.split(",");
		String[] parts1 =info2.split(",");
		String part1=parts[0];
		String part2=parts[1];
		String part3=parts[2];
		System.out.println("Student 1 ");
		System.out.println("Name = "+part1+"\n"+"Age = "+part2+"\n"+"Program = "+part3);
		String part4=parts1[0];
		String part5=parts1[1];
		String part6=parts[2];
		System.out.println("Student 2");
		System.out.print("Name = "+part4+"\n"+"Age = "+part5+"\n"+"Program = "+part6);
	}
}