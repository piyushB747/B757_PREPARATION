package net.kanth.queueapi;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue$_Test {

	public static void main(String[] args) {

		Deque<String> strDeque = new ArrayDeque<>();
		strDeque.add("Love");
		strDeque.add("Rub");
		strDeque.add("ABBA");
		strDeque.add("Mohan"); strDeque.addFirst("Geeks");
		strDeque.addLast("Geeks");

		
		strDeque.offerFirst("Chuma");   
		strDeque.offer("Rectangle");
		strDeque.offerLast("Lumuns");
		System.out.println(strDeque);

	}
}
