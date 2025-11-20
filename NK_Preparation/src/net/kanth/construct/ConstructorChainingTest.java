package net.kanth.construct;


/*
  Java enforces that a call to another constructor (this() or super()) must be the first statement in a constructor.
  Using both super() and this() in the same constructor is not allowed; it leads to a compile-time error.
 */
class Const$A {

	public int x1 = 12;

	public Const$A(int x1) {
		this.x1 = x1;
	}
}
class Const$A1 extends Const$A{

	public Const$A1(int x1) {
		super(x1);
	}	
}

public class ConstructorChainingTest {

	
	
	public static void main(String[] args) {
		
		Const$A1 c1 =new Const$A1(32);
        System.out.println("x1 = " + c1.x1); // 👈 prints value of x1

		
	}
}
