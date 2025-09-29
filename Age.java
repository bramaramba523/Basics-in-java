package Sampleone;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number between 1-50");
int input=sc.nextInt();
if(input>51)
{
	System.out.println("invalid");
}
if(input % 2==0)
{
	System.out.println("even numbers");
	
}else
{
	System.out.println("odd numbers");
}
sc.close();
	}

}
