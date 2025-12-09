package net.kanth.listapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class Examp$ArrayList {

	public static void main(String[] args) {

		List<String> str = new ArrayList<>(Arrays.asList("Piyush", "Suraj", null, null, "Aja", ""));

		str.add(6,"lovely");
//	Collections.reverseOrder();
		System.out.println(str+"\n");

		
		str.set(4, "Ajay");
		str.remove(5);
		System.out.println("After updation \n"+str);
		
	}

}
