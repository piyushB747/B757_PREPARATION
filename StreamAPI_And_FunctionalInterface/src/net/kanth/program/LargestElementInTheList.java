package net.kanth.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import net.kanth.MotherInterface;
import net.kanth.abstractmother.AbstractMother;

public class LargestElementInTheList extends AbstractMother{
	@Override
	public int largestElementInTheList(List<Integer> lstObj){
		
		Integer x = lstObj.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(0)
				.findFirst()
				.orElse(null);
		
		
		
		
		return x;
	}
	
	public static void main(String[] args) {
		List<Integer> lstInteger = new ArrayList<>(Arrays.asList(66,33,5,67,4,2,56565));
		MotherInterface m1 = new LargestElementInTheList();
		int x = m1.largestElementInTheList(lstInteger);
		
		System.out.println(x);
	}
	
}
