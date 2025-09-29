package pack12;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter first number: ");
int a=sc.nextInt();
System.out.println("enter second number: ");
int b=sc.nextInt();
System.out.println("enter operator (+,-,*,/): ");
char op=sc.next().charAt(0);
int result=0;
if(op=='+')
	result=a+b;
else if(op=='-')
	result=a-b;
else if(op=='*')
	result=a*b;
else if(op=='/')
	result=a/b;
else
	
	System.out.println("invalid operator ");;
	System.out.println("result = " + result);
	sc.close();
	}

}
