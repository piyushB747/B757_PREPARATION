package net.kanth.queueapi;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


//PriorityQueue Are sorted by default
public class Queue$_ {

	public static void main(String[] args) {
		
		Queue<String> obj_PQ = new PriorityQueue<>();
		obj_PQ.add("Piyush");
		obj_PQ.add("Patel");
		obj_PQ.add("Ravish");
	
		System.out.println("PriorityQueue List "+obj_PQ);
		
		
		Queue<Integer> obj_PQ2 = new PriorityQueue<>();
		obj_PQ2.add(5);
		obj_PQ2.add(4);
		obj_PQ2.add(2);
	
		System.out.println("sdad List "+obj_PQ2);
		
        Iterator<String> iterator = obj_PQ.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
        System.out.println();
		obj_PQ.forEach(p->{
			System.out.println(p);
		});
		
		
	}
	
}
