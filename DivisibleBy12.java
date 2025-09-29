package pack12;

import java.util.Scanner;

public class DivisibleBy12 {
	static void checkDivisible(int num)
	{
		if(num%12==0) {
			System.out.println(num+"is divisible by 12");
		}else
		{
			System.out.println(num+"is not divisible by 12");
		}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
checkDivisible(n);
sc.close();
	}

}
