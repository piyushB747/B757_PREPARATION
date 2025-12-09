package net.kanth.construct;

/*
There are the following three ways to copy the values of one object into another:

By Using a Constructor
By Assigning the Values of One Object to Another
By Using the clone() Method of the Object Class
 
 */
public class CopyConstructorPract1 {

	public int x1;
	public int x2;

	public CopyConstructorPract1(int x1,int x2) {
		this.x1 = x1;
		this.x2 = x2;
	}
	
	public CopyConstructorPract1(CopyConstructorPract1 c1) {
		this.x1=c1.x1;
		this.x2=c1.x2;
	}
	
	public void display() {
		System.out.println("Data of object "+x1+" And  "+x2);
	}
	
	public static void main(String[] args) {
		CopyConstructorPract1 p1 = new CopyConstructorPract1(5,6);
		CopyConstructorPract1 p2 =new CopyConstructorPract1(p1);
		p1.display();
		p2.display();
	}
	
}
