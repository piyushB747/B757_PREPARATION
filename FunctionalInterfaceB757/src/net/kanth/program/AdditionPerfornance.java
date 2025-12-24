package net.kanth.program;

import net.kanth.MotherInterface;

public class AdditionPerfornance {

	public static void main(String[] args) {

		MotherInterface<Integer> m1 = (x, y) -> x + y;
		System.out.println("Here, you get the result " + m1.printFm(7, 8));
		
		

	}

}
