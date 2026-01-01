package net.kanth.integerlst;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import net.kanth.AbstractMother;



public class IntegerClassOperation extends AbstractMother{

	@Override
	public int smallestElememtIntegerList(List<Integer> lstObj) {
		
		List<Integer> lstInteger  =  new ArrayList<>(Arrays.asList(55,10,20,30,1,2,4));
		
		Integer x =  lstInteger
				.stream()
				.distinct()
				.sorted(Comparator.naturalOrder())
				.skip(2)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Error: Element not found"));
		return x;
	}; 

	public static void main(String[] args) {
		AbstractMother mother = new IntegerClassOperation();
		System.out.println(" Smallest element in the list "+mother.smallestElememtIntegerList(new ArrayList<Integer>()));
		System.out.println(" Largest element in the list "+mother.largestElememtIntegerList(new ArrayList<Integer>(Arrays.asList(100,200,50,3435,3,55622,3))));
	}


	@Override
	public int largestElememtIntegerList(List<Integer> lstObj) {	
		return lstObj.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
	}
}
