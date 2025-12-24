package net.kanth;

import java.io.Serializable;
import java.util.UUID;

@FunctionalInterface
public interface MotherInterface<T> extends Serializable {

	public abstract Integer addition(int x, int y);

	private String generateUID() {
		return String.valueOf((UUID.randomUUID()));
	}
	
	default int printFm(int x, int y) {
		
		String geneString = generateUID();
		System.out.println("UUID generated for the request "+geneString);
		
		Integer result = addition(x, y);
		return result;
	}

}
