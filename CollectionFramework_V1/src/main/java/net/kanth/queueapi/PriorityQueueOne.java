package net.kanth.queueapi;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueOne {

	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(1);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());;
		System.out.println(pq.poll());;
	}
	
}
