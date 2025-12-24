package net.kanth.functionapi;

import java.util.function.Function;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FunctionExample {

	public static void main(String[] args) {

		Function<List<Integer>, Integer> xAI = x -> {
			return x.stream()
					.distinct()
					.sorted(Comparator.naturalOrder())
					.skip(1).findFirst()
					.orElseThrow(null);
		};
		
		
		System.out.println(xAI.apply(Arrays.asList(5,6,7,2,2,1,8)));
		
	}

}
