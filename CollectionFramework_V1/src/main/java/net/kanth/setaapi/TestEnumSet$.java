package net.kanth.setaapi;

import java.util.EnumSet;
import java.util.Iterator;

enum Days{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
public class TestEnumSet$ {

	
	public static void main(String[] args) {
		
		EnumSet<Days> e1 = EnumSet.allOf(Days.class);
		
		Iterator<Days> it =  e1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
