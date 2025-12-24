package net.kanth.consumerapi;

import java.util.function.BiConsumer;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class BiConsumerTest {

	public static void main(String[] args) {

		BiConsumer<List<Integer>, List<Integer>> lst = (x, y) -> {
			if (x.size() != y.size()) {
				return;
			} else {

				for (int i = 0; i < x.size(); i++) {

					if(x.get(i) != y.get(i)) {
						System.out.println("Not Equals");
						return;
					}
					System.out.println("Equals");
					
				}

			}
		};
		
		
		List<Integer> hubble = new ArrayList<Integer>(Arrays.asList(5,6,7,8,9));
		List<Integer> james = new ArrayList<Integer>(Arrays.asList(5,6,7,8,9));
		
		lst.accept(james, hubble);
		
		

	}

}
