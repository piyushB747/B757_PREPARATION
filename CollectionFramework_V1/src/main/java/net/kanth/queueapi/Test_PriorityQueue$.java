package net.kanth.queueapi;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test_PriorityQueue$ {

	public static void main(String[] args) {
		
		Queue<String> lObj =  new PriorityQueue<String>();
		lObj.add("Mithali");
		lObj.offer("Bustan");
		lObj.add("Mithali");
		lObj.add("Ravindra");
		lObj.add("Aitila");
		lObj.add("Devid");
		
		//lObj.add(null);
		
		
		System.out.println(lObj);
		
		
		
		Queue<Integer> lObj2 =  new PriorityQueue<Integer>();
		lObj2.add(1);
		lObj2.add(3);
		lObj2.add(4);
		lObj2.add(1);
		
		Iterator<Integer> it = lObj2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
}
