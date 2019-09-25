import java.util.*;
interface AdvanceArithmetic
{
    public int sumofFact(int n);
}
class Sumoffact implements AdvanceArithmetic
{
    public int sumofFact(int n)
    {
        int sum=0;
       for(int a=1;a<=1000;a++)
       {
        if(n%a==0)
        {
          sum=sum+a;
        }
       }
        return sum;
    }

    public static void main(String args[])
    {
        Sumoffact f=new Sumoffact();
        Scanner s=new Scanner(System.in);
        System.out.print("Plase Enter a Number = ");
        int n=s.nextInt();
        System.out.println("Sum of Factors of  "+n+"  are = "+f.sumofFact(n));
    }
}