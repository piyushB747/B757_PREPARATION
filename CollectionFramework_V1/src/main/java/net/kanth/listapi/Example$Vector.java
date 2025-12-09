package net.kanth.listapi;
import java.util.Vector;
public class Example$Vector {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();
		v.add("A");
		v.add("B");
		v.add("C");
		System.out.println(v);
		
		
		
		Vector<Integer> v1 = new Vector<>(3);
		v1.add(100);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(5);
		v1.add(6);
		
		
		System.out.println(v1);
		
		
		Vector<Integer> v2 = new Vector<>(v1);
		v2.set(0, 512);
		System.out.println(v2);
		
		
	}

}
