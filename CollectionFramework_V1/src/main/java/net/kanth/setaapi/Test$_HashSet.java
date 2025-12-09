package net.kanth.setaapi;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class Test$_HashSet {
	
	public static void main(String[] args) {
		
		Set<String> strHashSet1 = new HashSet<>();
		strHashSet1.add("Piyush");
		strHashSet1.add("Ravi");
		strHashSet1.add("Digvijay");
		strHashSet1.add("");
		strHashSet1.add(null);
		strHashSet1.add("Ajay");
		
		System.out.println(strHashSet1.isEmpty());
		
		strHashSet1.remove(null);
	
		Iterator<String> iterator = strHashSet1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//System.out.println(strHashSet1);
		System.out.println(strHashSet1.getClass().getName());
		
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(5);
		set2.add(6);
		set2.add(1);
		set2.add(3);
		set2.add(2);
		set2.add(null);
		
		System.out.println(set2);
		
	}

}
