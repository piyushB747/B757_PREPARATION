package net.kanth.queueapi;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class TestArrayDeque {

	public static void main(String[] args) {
		
		
		Deque<Integer>  l1=  new ArrayDeque<>();
		l1.add(3);
		l1.offer(2);
		l1.offerFirst(343);
		l1.addFirst(8434);
		l1.addLast(2);
		//l1.add(null);
		System.out.println(l1);
	}
	
}
