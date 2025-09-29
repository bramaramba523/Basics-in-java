package Sampleone;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int x,y,temp;
 
 System.out.println("enter the values of x & y");
 Scanner sc=new Scanner (System.in);
 x=sc.nextInt();
 y=sc.nextInt();
 System.out.println("the value before swapping is "+x+""+y);
 temp=x;
 x=y;
 y=temp;
 System.out.println("the value after swapping is"+x+""+y);
	}

}
