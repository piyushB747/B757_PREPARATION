package net.kanth.construct;

/*
 * 
 * When a class is extended, the subclass constructor automatically calls super() to initialize the parent class.

But if the parent constructor is private, then:

The subclass cannot access it.

The compiler cannot find any accessible constructor to call.

Hence, you get a compile-time error ❌.

Private default constructor only → inheritance not possible.
Private + public/ protected constructor → inheritance possible (if subclass can access one of them).
 */
class Const$A11 {

	@SuppressWarnings("unused")
	private Const$A11() {
		System.out.println("I am public constructor");
	}

	public Const$A11(int x1) {
		System.out.println("I am private constructor");
	}

}

class Const$A12 extends Const$A11 {
	public Const$A12(int x1) {
		super(x1); // ✅ explicitly calling public constructor of parent
	}

}

public class PrivateConstuctorTest {

	public static void main(String[] args) {
		Const$A12 a12 = new Const$A12(23);

	}

}
