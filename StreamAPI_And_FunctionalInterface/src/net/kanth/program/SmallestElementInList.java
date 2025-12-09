package net.kanth.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import net.kanth.MotherInterface;
import net.kanth.abstractmother.AbstractMother;

public class SmallestElementInList extends AbstractMother{

	@Override
	public int smallestElememtInTheList(List<Integer> lstObj) {
		
		Integer intSmallest = lstObj
				.stream()
				.distinct()
				.sorted(Comparator.naturalOrder())
				.findFirst()
				.get();
		
		System.out.println(intSmallest);
		
		return intSmallest;
	}

	
	public static void main(String[] args) {
		List<Integer> lstInteger = new ArrayList<>(Arrays.asList(66,33,5,67,4,2,56565));
		MotherInterface m1 = new SmallestElementInList();
		m1.smallestElememtInTheList(lstInteger);
		
	}
	

}
