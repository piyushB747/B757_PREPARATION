package net.kanth.setaapi;

import java.util.LinkedHashSet;

public class Test$_LinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> objLinkedHashSet = new LinkedHashSet<String>();
		objLinkedHashSet.add("Abhishek");
		objLinkedHashSet.add("Ravi");
		objLinkedHashSet.add("Shubham");
		objLinkedHashSet.add("Dixit");
		
		System.out.println(objLinkedHashSet);
		
		LinkedHashSet<Integer> linkedObj = new LinkedHashSet<Integer>();
		linkedObj.add(5);
		linkedObj.add(1);
		linkedObj.add(2);
		linkedObj.add(3);
		
		System.out.println(linkedObj);
		
	}
}
