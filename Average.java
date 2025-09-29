package NewPack;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the name:");
String name=sc.nextLine();
System.out.println("enr 3 subject marks");
int s1=sc.nextInt();
int s2=sc.nextInt();
int s3=sc.nextInt();
int sum=s1+s2+s3;
int avg=sum/3;
System.out.println("sumof 3 "+sum);
System.out.println("avg is"+avg);

	}

}
