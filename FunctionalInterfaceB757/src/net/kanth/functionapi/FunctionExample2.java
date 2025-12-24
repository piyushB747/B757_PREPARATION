package net.kanth.functionapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class FunctionExample2 {

	public static void main(String[] args) {
		
		Function<List<Integer>, Integer> xAI = x -> {
			return x.stream()
					.distinct()
					.sorted(Comparator.naturalOrder())
					.skip(1).findFirst()
					.orElseThrow(null);
		};
		
		Function<List<Integer>, List<Integer>> addFunc = list -> {
		    list.add(0);
		    return list;
		};
	
		xAI = xAI.compose(addFunc);
		
		
		System.out.println(xAI.andThen(x-> x*5).apply(new ArrayList<>(Arrays.asList(5,6,7,3,2,1))));

	
		
		
	}

}
