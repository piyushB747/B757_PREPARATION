package net.kanth.consumerapi;

import java.util.function.Consumer;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ConsumerPract2 {
	
	public static void main(String[] args) {
		
		
		Consumer<List<Integer>> modify = xx -> {
			
			for(int i = 0;i < xx.size();i++) {
				xx.set(i,i*xx.get(i));
			}
		};
		
		Consumer<List<Integer>> dispLay = xx -> xx.forEach( p-> {
			System.out.println(p);
		});
		
		
		List<Integer> hubble = new ArrayList<Integer>(Arrays.asList(5,6,7,8,9));
		
		
		modify.andThen(dispLay).accept(hubble);
		
		
		
		
	}

}
