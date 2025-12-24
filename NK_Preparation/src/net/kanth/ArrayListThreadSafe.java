package net.kanth;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
public class ArrayListThreadSafe {

//Exception in thread "main" java.util.ConcurrentModificationException
//ArrayList is not a Thread-Safe
//ArrayList cannot perform read and write operation at the same time. we cannot modified list while reading
		
/**
To Overcome this you have to use CopyOnWriteArrayList
While Iterating loop it is getting from original CopyOnWriteArrayList
But while adding java internally create copy of original CopyOnWriteArrayList
At the end of the loop the reference copy of original list is dump into the original CopyOnWriteArrayList  	
**/
	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
		List<Integer> lst2 = new CopyOnWriteArrayList<>();
	
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(5);
		lst.add(6);
		
		try {
		for(int i : lst) {
			if(i == 3) {
				lst.add(56);
			}
		}
		}catch(Exception ex) {ex.printStackTrace(); }
		System.out.println(lst);

		lst2.add(1);
		lst2.add(2);
		lst2.add(4);
		
		for(int i : lst2) {
			if( i == 2) {
				lst2.add(56654);
			}
		}
		
		System.out.println(lst2);
	}
	
}
