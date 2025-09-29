package Sampleone;

import java.util.Scanner;

public class AssainOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;//a & b operand
		Scanner obj=new Scanner(System.in);//scanner opens
	  
	    System.out.println("enter the first number");
		a=obj.nextInt();
		System.out.println("enter the second number");
		b=obj.nextInt();
		//greater than operator
		System.out.println(a<b);
		//less than operator
		System.out.println(a>b);
		//equal to operator
		System.out.println(a==b);
		//not equal to operator
		System.out.println(a!=b);
		//grater(>)than equal to operator
		System.out.println(a>=b);
		//less(<)than equal to operator
		System.out.println(a<=b);
		obj.close();
		
	}

}
