package Sampleone; //inheritance

 abstract class shape {//abstract class class name
	 public void cir()//concrete method
	 {
		 System.out.println("CIR");
	 }
 }
 class Pen extends shape{
	 public void rect()
	 {
		 System.out.println("RECT");
	 }
 }
 
 //main class
 public class Abs1
 {
	 public static void main(String[] args) {
		 Pen obj1=new Pen();//class
		// abstract class  objname=new classname();
		 
		 shape obj2=new Pen();//abstract class
		 obj1.rect();
		 obj2.cir();
		 
 
	}

}
