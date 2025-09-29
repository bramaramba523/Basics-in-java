package pack11;

import java.util.Scanner;

public class secondlarger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int lar=0;
int sec=0;
if(a>b)
{lar=a;
sec=b;
 
	}
else
{
	lar=b;
	sec=a;
}
if(c>lar)
{
	lar=c;
	sec=lar;
}
else
{
	sec=c;
	
}
}
}