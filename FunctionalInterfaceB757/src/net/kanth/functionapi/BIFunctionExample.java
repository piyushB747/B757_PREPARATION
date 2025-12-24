package net.kanth.functionapi;

import java.util.function.BiFunction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BIFunctionExample {

	public static void main(String[] args) {

		BiFunction<List<Integer>, List<Integer>, Integer> xAI = (x, y) -> {
			if (x.size() == y.size()) {
				return x.get(1) + y.get(1);
			}
			return null;
		};
		
		List<Integer> abs1 =  new ArrayList<>(Arrays.asList(5,6,67,2));
		List<Integer> abs2 =  new ArrayList<>(Arrays.asList(55,44,666,54));
		
		System.out.println(xAI.andThen(x ->  x/10).apply(abs1, abs2));
		
		

	}

}
