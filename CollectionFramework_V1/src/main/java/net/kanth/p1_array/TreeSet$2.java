package net.kanth.p1_array;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet$2 {

	public static void main(String[] args) {
		
		Set<StringBuffer> ts = new TreeSet<>(new Comparator<StringBuffer>() {
			@Override
			public int compare(StringBuffer sb1, StringBuffer sb2) {
				return sb1.toString().compareTo(sb2.toString());
			}
		});
	    
		// Adding elements to the TreeSet
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("L"));
        ts.add(new StringBuffer("B"));
        ts.add(new StringBuffer("O"));
        ts.add(new StringBuffer("1"));
        System.out.println(ts); 

	}
}
