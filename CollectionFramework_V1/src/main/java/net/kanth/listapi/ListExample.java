package net.kanth.listapi;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {


		LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, null, null, 00));

		
		System.out.println(l1.peekFirst()+" "+l1);
	}

}
