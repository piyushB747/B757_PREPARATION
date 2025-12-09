package net.kanth.methodoia1;

class A_ {
	public int apple() {
		System.out.println("This is an apple");
		return 12;
	}
	
	public static void rocky() {
		System.out.println("I am the best");
	}
	
}

class B_ extends A_ {
	@Override
	public int apple() {
		System.out.println("This is second Apple");
		return 32;
	}
}

public class OverridenA1Test {

	public static void main(String[] args) {

		B_ b = new B_();
		b.apple();
		B_.rocky();
		
	}

}
