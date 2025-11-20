package net.kanth.interfacespract;

interface A$_ {

	public abstract void aA();

	private void rohan() {
		System.out.println("This is private method");
	}

	default void Rohania() {
		rohan();
	}

	public static void luvksuh() {
		System.out.println("I am the luvush");
	}

	// protected abstract void aB(); // Can't possible

	// private abstract void aC(); // can't possible
}

class Vicky$_132 implements A$_ {

	@Override
	public void aA() {
		System.out.println("I am the best");
	}

}

public class TestInterface {

	public static void main(String[] args) {
		A$_ a1 = new Vicky$_132();
		a1.aA();
		a1.Rohania(); // Calling default method of Interface
		A$_.luvksuh(); // Calling static method of Interface

	}

}
