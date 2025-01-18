package net.kanth.p1_array;
import java.util.HashMap;
import java.util.Map;
public class DuplicateElement {

	private Map<Integer,Integer> duplicateElement(int arr[]){
		
		Map<Integer,Integer> l_objMap = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(l_objMap.containsKey(arr[i])) {
				 int value = l_objMap.get(arr[i]);
				 l_objMap.put(arr[i], value+1);
			}else {
				l_objMap.put(arr[i],1);
			}
		}
		return l_objMap;
	}
	
	public static void main(String[] args) {

		DuplicateElement obj = new DuplicateElement();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 1 ,1,1};
		
		Map<Integer,Integer> objMap = obj.duplicateElement(arr);
		System.out.println("Here are the duplicate elements in array => \n"+objMap); 

	}
}
