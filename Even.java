package pack12;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
   Scanner obj=new Scanner(System.in);
   int num=obj.nextInt();
   if(num%2==0)
   {
	   System.out.println("number is even");
	   
   }
   else
   {
	   System.out.println("numberis odd");
   }
   obj.close();
	}

}
