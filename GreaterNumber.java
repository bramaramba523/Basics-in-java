package Sampleone;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   Scanner obj=new Scanner(System.in);
   System.out.println("Biggest among two numbers");
   
		   System.out.println("Enter the first number");
		   int a=obj.nextInt();
		   System.out.println("Enter the second number");
		   int b=obj.nextInt();
		   if(a>b)
		   {
			   System.out.println("a is the biggest");
		   }
		   else
		   {
			   System.out.println("b is the biggest");
		   }
	}

}
