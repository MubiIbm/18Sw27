import java.util.*;
class Vowel
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		char c;
		System.out.print("Enter an alphabet = ");
		c=s.next().charAt(0);
		switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.print("It is Vowel");
			break;
			default :
			System.out.print("It is Consonant");
			break;


		}
	}
}