package net.kanth.supplierapi;

import java.util.function.Supplier;

public class ExampleOfSupplier {
	
	
	public static void main(String[] args) {
		
		Supplier<Double> xNa = () -> {return 5.0;};
		System.out.println(xNa.get());
		
	}

}
