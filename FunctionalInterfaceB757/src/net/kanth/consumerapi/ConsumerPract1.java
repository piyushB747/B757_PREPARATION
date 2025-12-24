package net.kanth.consumerapi;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;
public class ConsumerPract1 {

	public static void main(String[] args) {
		
		Consumer<Integer>  xAI =  x -> ++x;
		
		Integer x =12;
		xAI.accept(x);
		System.out.println(x);
		
		
		Consumer<List<Integer>> objConsume = xx -> {
			
			for(int i = 0;i < xx.size();i++) {
				xx.set(i,i*xx.get(i));
			}
		};
		
		List<Integer> hubble = new ArrayList<Integer>(Arrays.asList(5,6,7,8,9));
		objConsume.accept(hubble);
		
		
		System.out.println(hubble);
		
		
	}
	
}
