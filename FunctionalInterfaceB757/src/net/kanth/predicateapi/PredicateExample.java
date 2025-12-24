package net.kanth.predicateapi;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		Predicate<Integer> xAI  =  (x) -> x >10;
		Predicate<Integer> xAI2 =  (xx) -> xx < 20;
	
		

		
		boolean back =  xAI.and(xAI2).negate().test(15);
		System.out.println(back);
		
		
		IntPredicate xNX = x -> x>10;
		
		
		System.out.println(xNX.test(5));
		
	}
	
}
