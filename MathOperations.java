package Sampleone;

import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner obj=new Scanner(System.in);//scanner opens
    int a,b,c,d,sum,sub,div,mod;
    System.out.println("enter the first number");
	a=obj.nextInt();
	System.out.println("enter the second number");
	b=obj.nextInt();
	sum=a+b;
	System.out.println("sum is "+sum);		
	
	    System.out.println("enter the first number");
		c=obj.nextInt();
		System.out.println("enter the second number");
		d=obj.nextInt();
		sub=c-d;
		System.out.println("sub is "+sub);
		 float mul;
		    System.out.println("enter the first number");
			a=obj.nextInt();
			System.out.println("enter the second number");
			b=obj.nextInt();
			mul=a*b;
			System.out.println("mul is "+mul);		
			
			
			    System.out.println("enter the first number");
				a=obj.nextInt();
				System.out.println("enter the second number");
				b=obj.nextInt();
				mod=a/b;
				System.out.println("mod is "+mod);	
				 
				
				    System.out.println("enter the first number");
					a=obj.nextInt();
					System.out.println("enter the second number");
					b=obj.nextInt();
					div=a%b;
					System.out.println("div is "+div);		
					
					obj.close();
					
    
	}

}
