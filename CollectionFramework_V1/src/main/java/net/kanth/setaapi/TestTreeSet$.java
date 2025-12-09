package net.kanth.setaapi;

import java.util.TreeSet;

public class TestTreeSet$ {

	public static void main(String[] args) {
		
		TreeSet<String> objStr =  new TreeSet<>();
		objStr.add("Mumbai");
		objStr.add("Delhi");
		objStr.add("Chennai");
		objStr.add("Kolkata");
		objStr.add("Pune");
		objStr.add("Hyderabad");
		objStr.add("Bengaluru");
		
		System.out.println(objStr);    
		
		System.out.println(objStr.first());  //Print First value from the list;
		
		System.out.println(objStr.last()); // Print the last element in the TreeSet

		System.out.println(objStr.lower("Delhi"));    //value just lower than the string
		System.out.println(objStr.higher("Delhi"));   //Value just greater than the string
		
		objStr.pollFirst();  //removing the first element using pollFirst
		objStr.pollLast();    // removing last element using pollLast
		
		System.out.println(objStr.remove("Kolkata"));  //remove
		System.out.println(objStr);    //[Bengaluru, Chennai, Delhi, Hyderabad, Mumbai, Pune]
		System.out.println("\n"+"List After iteration");
		for(String str : objStr) {
			System.out.println(str);
		}
		
	}
	
}
