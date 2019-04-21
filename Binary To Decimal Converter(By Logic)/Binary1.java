import java.util.*;
import java.lang.*;
class Binary1{    
public static long Decimal(long num){   
     long b = 0;  
     long deci = 0; 
    while(true){  
      if(num == 0){  
        break;  
      } 
      else {  
          long temp = num%10;  
          deci += temp*Math.pow(2, b);  
          num = num/10;  
          b++;  
       }  
    }  
    return deci;  
}  
public static void main(String args[]){ 
Scanner sc = new Scanner(System.in); 
long a;
System.out.print("Enter Number in Binary = ");
a=sc.nextLong();
System.out.println("Decimal Number of Given Number is = "+Decimal(a));  
}
}